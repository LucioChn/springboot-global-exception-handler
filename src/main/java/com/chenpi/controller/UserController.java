package com.chenpi.controller;

import com.chenpi.pojo.dto.UserDTO;
import com.chenpi.pojo.vo.GeneralResult;
import com.chenpi.service.UserService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author 陈皮
 * @version 1.0
 * @date 2021/12/30
 */
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping("add")
  public GeneralResult<UserDTO> add(@RequestBody @Valid UserDTO userDTO) {
    UserDTO user = userService.add(userDTO);
    return GeneralResult.genSuccessResult(user);
  }

  @GetMapping("find/{userId}")
  public GeneralResult<UserDTO> find(@PathVariable String userId) {
    UserDTO user = userService.getById(userId);
    return GeneralResult.genSuccessResult(user);
  }

  @GetMapping("marry/{age}")
  public GeneralResult<UserDTO> marry(@PathVariable String age) {
    userService.marry(age);
    return GeneralResult.genSuccessResult();
  }

}