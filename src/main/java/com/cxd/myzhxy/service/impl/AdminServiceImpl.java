package com.cxd.myzhxy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cxd.myzhxy.mapper.AdminMapper;
import com.cxd.myzhxy.pojo.Admin;
import com.cxd.myzhxy.pojo.LoginForm;
import com.cxd.myzhxy.service.AdminService;
import com.cxd.myzhxy.util.MD5;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * @author shkstart
 * @NAME AdminServiceImpl
 * @create 2022-09-14 16:39
 */

@Service("adminService")
@Transactional
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    /**
     * 超级管理员登录
     * @param loginForm
     * @return
     */
    @Override
    public Admin login(LoginForm loginForm) {
        //创建QueryWrapper对象
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        //拼接查询条件
        queryWrapper.eq("name",loginForm.getUsername());
        // 转换成密文进行查询
        queryWrapper.eq("password", MD5.encrypt(loginForm.getPassword()));

        Admin admin = baseMapper.selectOne(queryWrapper);

        return admin;
    }

    @Override
    public Admin getAdminById(Long userId) {
        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<>();
        adminQueryWrapper.eq("id",userId);
        return baseMapper.selectOne(adminQueryWrapper);
    }

    @Override
    public IPage<Admin> getAdmins(Page<Admin> pageParam, String adminName) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if(!StringUtils.isEmpty(adminName)){
            queryWrapper.like("name",adminName);
        }
        queryWrapper.orderByDesc("id");
        queryWrapper.orderByAsc("name");
        Page page = baseMapper.selectPage(pageParam, queryWrapper);
        return page;
    }
}
