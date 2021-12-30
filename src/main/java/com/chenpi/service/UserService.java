package com.chenpi.service;

import com.chenpi.exception.BizException;
import com.chenpi.exception.UserErrorEnum;
import com.chenpi.pojo.dto.UserDTO;
import java.util.Objects;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 * 用户相关业务
 *
 * @author 陈皮
 * @version 1.0
 * @date 2021/12/30
 */
@Service
public class UserService {

  public UserDTO add(UserDTO userDTO) {
    String userId = UUID.randomUUID().toString();
    userDTO.setId(userId);
    return userDTO;
  }

  public UserDTO getById(String id) {
    // 模拟业务异常
    if (Objects.equals(id, "000")) {
      throw new BizException(UserErrorEnum.USER_NOT_FOUND);
    }
    return new UserDTO(id, "陈皮", 18);
  }

  public void marry(String age) {
    // 当age不是数字字符串时，抛出异常
    Integer integerAge = Integer.valueOf(age);
    System.out.println(integerAge);
  }
}