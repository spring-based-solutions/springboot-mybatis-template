package com.example.template.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 示例VO
 * @author NULL
 * @since 2020-11-21
 */
@Data
public class StudentVo implements Serializable {

    @NotNull
    private Long id;

    private String name;

    private boolean sex;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

}
