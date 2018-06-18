package com.imooc.vo;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author GZM
 * @since 2018-06-14
 */
@TableName("role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    @TableField("role_name")
    private String roleName;
    @TableId("role_id")
    private Integer roleId;


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

    @Override
    public String toString() {
        return "Role{" +
        ", roleName=" + roleName +
        ", roleId=" + roleId +
        "}";
    }
}
