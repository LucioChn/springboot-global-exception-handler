package com.nobody.service.impl;

import com.nobody.exception.BizException;
import com.nobody.exception.UserErrorEnum;
import com.nobody.pojo.dto.UserDTO;
import com.nobody.pojo.entity.UserEntity;
import com.nobody.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/6
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity add(UserDTO userDTO) {
        String userId = UUID.randomUUID().toString();
        return new UserEntity(userId, userDTO.getName(), userDTO.getAge());
    }

    @Override
    public UserEntity getById(String id) {
        // 模拟业务异常
        if (Objects.equals(id, "000")) {
            throw new BizException(UserErrorEnum.USER_NOT_FOUND);
        }
        return new UserEntity(id, "Mr.nobody", 18);
    }

    @Override
    public void marry(String age) {
        // 当age不是数字字符串时，抛出异常
        Integer integerAge = Integer.valueOf(age);
        System.out.println(integerAge);
    }
}
