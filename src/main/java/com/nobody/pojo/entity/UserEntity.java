package com.nobody.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Description 用户实体类
 * @Author Mr.nobody
 * @Date 2021/2/6
 * @Version 1.0
 */
@AllArgsConstructor
@Getter
@Setter
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 5564446583860234738L;

    private String id;
    private String name;
    private int age;

}
