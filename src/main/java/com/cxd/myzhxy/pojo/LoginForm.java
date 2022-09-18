package com.cxd.myzhxy.pojo;

import lombok.Data;

/**
 * @author shkstart
 * @NAME LoginForm
 * @create 2022-09-14 16:09
 */
@Data
public class LoginForm {

    private String username;
    private String password;
    private String verifiCode;
    private Integer userType;

}
