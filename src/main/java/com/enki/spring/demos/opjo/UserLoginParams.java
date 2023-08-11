package com.enki.spring.demos.opjo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Enki
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@ApiModel(value = "用户登录", description = "用户登录参数表")
public class UserLoginParams implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "登录名")
    @NotBlank(message = "登录名不能为空")
    private String userLogin;

    @ApiModelProperty(value = "密码")
    @NotBlank(message = "密码不能为空")
    private String userPass;


}
