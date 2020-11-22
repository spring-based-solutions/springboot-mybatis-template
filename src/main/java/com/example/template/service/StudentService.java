package com.example.template.service;

import com.example.template.entity.Student;
import com.example.template.mapper.StudentMapper;
import com.example.template.vo.StudentVo;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 示例服务
 *
 * @author NULL
 * @since 2020-11-21
 */
@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private DozerBeanMapper dozerBeanMapper;

    public List<StudentVo> listAll() {
        List<Student> students = studentMapper.selectAll();
        List<StudentVo> list = new ArrayList<>();
        for (Student student : students) {
            StudentVo vo = dozerBeanMapper.map(student, StudentVo.class);
            list.add(vo);
        }
        return list;
    }

    public StudentVo getById(Long id) {
        Student student = studentMapper.selectById(id);
        if(student!=null){
            return dozerBeanMapper.map(student, StudentVo.class);
        }
        return null;
    }

    public boolean add(StudentVo vo) {
        Student student = dozerBeanMapper.map(vo,Student.class);
        return studentMapper.insert(student) > 0;
    }

    public boolean update(StudentVo vo) {
        Student student = dozerBeanMapper.map(vo,Student.class);
        return studentMapper.update(student) > 0;
    }

    public boolean deleteById(Long id) {
        return studentMapper.deleteBy(id) > 0;
    }
}
