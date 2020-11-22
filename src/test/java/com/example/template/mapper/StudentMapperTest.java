package com.example.template.mapper;

import com.example.template.entity.Student;
import com.example.template.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author NULL
 * @since 2020-11-21
 */
@Slf4j
@SpringBootTest
public class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;

    @Test
    public void testListAll(){
        List<Student> list =studentMapper.selectAll();
        log.info("学生列表：{}",list);
        Assert.notEmpty(list,"学生列表不能为空");
    }
}
