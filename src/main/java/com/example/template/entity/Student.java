package com.example.template.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author NULL
 * @since 2020-11-21
 */
@Data
public class Student implements Serializable {

    private Long id;

    private String name;

    private boolean sex;

    private Date birthday;

}
