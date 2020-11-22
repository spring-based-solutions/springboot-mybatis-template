package com.example.template.config;

import lombok.Data;

import java.io.Serializable;

/**
 * 公共响应
 * @author NULL
 * @since 2020-11-22
 */
@Data
public class CommonResponse<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

}
