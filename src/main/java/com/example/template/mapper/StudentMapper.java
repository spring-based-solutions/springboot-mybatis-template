package com.example.template.mapper;

import com.example.template.entity.Student;

import java.util.List;

/**
 * @author NULL
 * @since 2020-11-21
 */
public interface StudentMapper {

    List<Student> selectAll();

    Student selectById(Long id);

    int insert(Student student);

    int update(Student student);

    int deleteBy(Long id);
}
