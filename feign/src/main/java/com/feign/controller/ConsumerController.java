package com.feign.controller;

import com.feign.entity.Student;
import com.feign.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-11-04 14:13
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Resource
    private StudentService studentService;

    /**
     * 调用服务提供者
     * @return
     */
    @RequestMapping("/showMybatis")
    public Student showMybatis(@RequestParam("name") String name){
        return studentService.showStudentByName(name);
    }

    /**
     * 调用服务提供者
     * @return
     */
    @RequestMapping("/showConsumer")
    public Student showConsumer(){
        return studentService.showStudent();
    }
}
