package com.cxd.myzhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @NAME Clazz
 * @create 2022-09-14 15:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "clazz")
public class Clazz {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer number;
    private String introducation;
    private String headmaster;
    private String email;
    private String telephone;
    private String gradeName;
}
