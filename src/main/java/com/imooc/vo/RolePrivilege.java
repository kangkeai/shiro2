package com.imooc.vo;

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
@TableName("role_privilege")
public class RolePrivilege extends Model<RolePrivilege> {

    private static final long serialVersionUID = 1L;

    @TableField("role_id")
    private Integer roleId;
    @TableField("privilege_id")
    private Integer privilegeId;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

    @Override
    public String toString() {
        return "RolePrivilege{" +
        ", roleId=" + roleId +
        ", privilegeId=" + privilegeId +
        "}";
    }
}
