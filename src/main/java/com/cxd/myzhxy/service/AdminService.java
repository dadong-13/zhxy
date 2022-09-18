package com.cxd.myzhxy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cxd.myzhxy.pojo.Admin;
import com.cxd.myzhxy.pojo.LoginForm;

/**
 * @author shkstart
 * @NAME AdminService
 * @create 2022-09-14 16:37
 */
public interface AdminService extends IService<Admin> {

    /**
     * 登录
     * @param loginForm
     * @return
     */
    Admin login(LoginForm loginForm);

    Admin getAdminById(Long userId);

    IPage<Admin> getAdmins(Page<Admin> pageParam, String adminName);
}

