package com.nobody.service;

import com.nobody.pojo.dto.UserDTO;
import com.nobody.pojo.entity.UserEntity;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/6
 * @Version 1.0
 */
public interface UserService {
    UserEntity add(UserDTO userDTO);

    UserEntity getById(String id);

    void marry(String age);
}
