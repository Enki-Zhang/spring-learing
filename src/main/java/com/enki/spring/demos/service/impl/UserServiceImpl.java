package com.enki.spring.demos.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.enki.spring.demos.mapper.UserMapper;
import com.enki.spring.demos.model.AdminUserDetails;
import com.enki.spring.demos.opjo.Users;
import com.enki.spring.demos.service.UserService;
import com.enki.spring.demos.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @author Enki
 * @Version 1.0
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, Users> implements UserService {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    /**
     * 登录接口 JWT判断
     */
    public String login(String userName, String passWord) {
//
        UserDetails userDetails = loadUserByUsername(userName);
        return jwtTokenUtil.generateToken(userDetails);


    }

    /**
     * 获取用户对应的资源
     */
    @Override
    public UserDetails loadUserByUsername(String username) {

        return null;
    }


}
