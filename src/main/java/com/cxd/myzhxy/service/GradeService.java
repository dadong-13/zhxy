package com.cxd.myzhxy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cxd.myzhxy.pojo.Grade;

import java.util.List;

/**
 * @author shkstart
 * @NAME GradeService
 * @create 2022-09-14 16:46
 */
public interface GradeService extends IService<Grade> {
    IPage<Grade> getGradeByOpr(Page<Grade> page, String gradeName);

    List<Grade> getGrades();
}
