package com.cxd.myzhxy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cxd.myzhxy.pojo.LoginForm;
import com.cxd.myzhxy.pojo.Student;

/**
 * @author shkstart
 * @NAME StudentService
 * @create 2022-09-14 16:46
 */
public interface StudentService extends IService<Student> {

    /**
     * 学生登录方法
     * @return
     */
    public Student login(LoginForm loginForm);


    Student getStudentById(Long userId);

    IPage<Student> getStudentByOpr(Page<Student> page, Student student);
}
