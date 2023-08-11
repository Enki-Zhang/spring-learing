package com.enki.spring.demos.controller;

import com.enki.spring.demos.enums.ResultCode;
import com.enki.spring.demos.opjo.UserLoginParams;
import com.enki.spring.demos.result.ResultObject;
import com.enki.spring.demos.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author Enki
 * @Version 1.0
 */
@Slf4j
@RestController
@Api(tags = "用户")
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UserService userService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "登录以后返回token")
    @PostMapping("/login")
    public ResultObject login(@Validated UserLoginParams user, BindingResult result) {
        String login = userService.login(user.getUserLogin(), user.getUserPass());

        log.info("这是测试 {}", "测试返回");
        HashMap<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", "userToken");
        tokenMap.put("tokenHead", "tokenHead");
        return ResultObject.success(tokenMap);
    }


}
