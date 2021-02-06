package com.nobody.controller;

import com.nobody.pojo.dto.UserDTO;
import com.nobody.pojo.entity.UserEntity;
import com.nobody.pojo.vo.GeneralResult;
import com.nobody.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Description
 * @Author Mr.nobody
 * @Date 2021/2/6
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping("add")
    public GeneralResult<UserEntity> add(@RequestBody @Valid UserDTO userDTO) {
        UserEntity user = userService.add(userDTO);
        return GeneralResult.genSuccessResult(user);
    }

    @GetMapping("find/{userId}")
    public GeneralResult<UserEntity> find(@PathVariable String userId) {
        UserEntity user = userService.getById(userId);
        return GeneralResult.genSuccessResult(user);
    }

    @GetMapping("marry/{age}")
    public GeneralResult<UserEntity> marry(@PathVariable String age) {
        userService.marry(age);
        return GeneralResult.genSuccessResult();
    }

}
