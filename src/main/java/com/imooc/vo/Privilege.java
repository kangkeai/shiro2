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
@TableName("privilege")
public class Privilege extends Model<Privilege> {

    private static final long serialVersionUID = 1L;

    @TableField("privilege_name")
    private String privilegeName;
    @TableField("privilege_id")
    private Integer privilegeId;


    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    protected Serializable pkVal() {
        return this.privilegeId;
    }

    @Override
    public String toString() {
        return "Privilege{" +
        ", privilegeName=" + privilegeName +
        ", privilegeId=" + privilegeId +
        "}";
    }
}
