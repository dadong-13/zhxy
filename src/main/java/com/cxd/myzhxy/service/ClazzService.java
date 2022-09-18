package com.cxd.myzhxy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cxd.myzhxy.pojo.Clazz;

import java.util.List;

/**
 * @author shkstart
 * @NAME ClazzService
 * @create 2022-09-14 16:45
 */
public interface ClazzService extends IService<Clazz> {
    IPage<Clazz> getClazzsByOpr(Page<Clazz> page, Clazz clazz);

    List<Clazz> getClazzs();
}

