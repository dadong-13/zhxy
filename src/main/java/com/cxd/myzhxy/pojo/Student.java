package com.cxd.myzhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @NAME Student
 * @create 2022-09-14 16:03
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "student")
public class Student {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String sno;
    private String name;
    private char gender;
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String introducation;
    private String portraitPath;
    private String clazzName;

}
