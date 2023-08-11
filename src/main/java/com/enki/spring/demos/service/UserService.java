package com.enki.spring.demos.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.enki.spring.demos.opjo.UserLoginParams;
import com.enki.spring.demos.opjo.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @author Enki
 * @Version 1.0
 */

public interface UserService extends IService<Users> {

     String login(String userName, String passWord);
     UserDetails loadUserByUsername(String username);

}
