package com.chenpi.pojo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 添加用户时参数类
 *
 * @author 陈皮
 * @version 1.0
 * @date 2021/12/30
 */
@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

  private String id;
  @NotBlank(message = "用户名不能为空")
  private String name;
  @Min(value = 0, message = "年龄最小不能低于0")
  private int age;
}