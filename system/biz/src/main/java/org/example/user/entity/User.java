package org.example.user.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户表实体
 * Author: 18615
 * Date: 2024/3/18 20:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 登录账号
     */
    private String username;
    /**
     * 姓名
     */
    private String realname;
    /**
     * 密码
     */
    private String password;
    /**
     * phone
     * */
    private String phone;

    /**
     * 删除状态
     * */
    @TableLogic
    private Integer delFlag;
}
