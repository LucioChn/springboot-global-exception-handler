package com.nobody.pojo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @Description 添加用户时参数类
 * @Author Mr.nobody
 * @Date 2021/2/6
 * @Version 1.0
 */
@Getter
@Setter
public class UserDTO {
    @NotEmpty(message = "用户名不能为空")
    private String name;
    @Min(value = 0, message = "年龄最小不能低于0")
    private int age;
}
