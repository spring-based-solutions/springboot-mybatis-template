package com.example.template.service;

import com.example.template.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author NULL
 * @since 2020-11-22
 */
@SpringBootTest
public class StudentServiceTest {

    @Resource
    private StudentService studentService;


    @Test
    void testListAll() {
        studentService.listAll();
    }

    @Test
    void testGetById() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void testUpdate() {
    }

    @Test
    void testDeleteById() {
    }
}
