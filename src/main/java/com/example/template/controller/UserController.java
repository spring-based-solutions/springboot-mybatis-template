package com.example.template.controller;

import com.example.template.service.StudentService;
import com.example.template.vo.StudentVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * 示例Controller
 * @author NULL
 * @since 2020-11-22
 */
@RestController
@RequestMapping("users")
public class UserController {

    @Resource
    private StudentService studentService;

    /**
     * 获取所有学生
     * @return 学生列表
     */
    @GetMapping
    public List<StudentVo> listAll(){
        return studentService.listAll();
    }

    /**
     * 根据ID获取
     * @param id 学生ID
     * @return 学生VO
     */
    @GetMapping("user")
    public StudentVo getById(@RequestParam(name = "id") Long id){
        return studentService.getById(id);
    }

    /**
     * 新增单个学生
     * @param vo 学生VO
     * @return 成功标识
     */
    @PostMapping
    public boolean add(@RequestBody @Valid StudentVo vo){
        return studentService.add(vo);
    }

    /**
     * 修改
     * @param vo 学生VO
     * @return 成功标识
     */
    @PutMapping
    public boolean update(@RequestBody @Valid StudentVo vo){
        return studentService.update(vo);
    }
}
