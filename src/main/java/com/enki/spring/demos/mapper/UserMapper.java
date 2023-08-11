package com.enki.spring.demos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.enki.spring.demos.opjo.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Enki
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<Users> {

}
