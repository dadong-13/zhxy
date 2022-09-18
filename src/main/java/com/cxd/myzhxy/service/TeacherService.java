package com.cxd.myzhxy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cxd.myzhxy.pojo.LoginForm;
import com.cxd.myzhxy.pojo.Teacher;

/**
 * @author shkstart
 * @NAME TeacherService
 * @create 2022-09-14 16:47
 */
public interface TeacherService extends IService<Teacher> {

    /**
     * 登录方法
     */
    public Teacher login(LoginForm loginForm);


    Teacher getTeacherById(Long userId);

    IPage<Teacher> getTeachersByOpr(Page<Teacher> pageParam, Teacher teacher);
}
