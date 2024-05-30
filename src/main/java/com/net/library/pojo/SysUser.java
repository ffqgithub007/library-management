package com.net.library.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SysUser
{
    private static final long serialVersionUID =1L;
    /** 用户ID **/    //@Excel导入数据进数据库  注解poi来实现
//    @Excel(name="用户序号", cellType= ColumnType.NUMERIC,prompt="用户编号")
    private long id;

    private String workId;

    @JsonFormat(timezone = "GTM+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    /**   登录名称  */
    private String loginName;

    /**  用户名称   */
    private String userName;

    /** 用户名称  */
    private String userType;

    /** 用户邮箱 */
    private String email;

    /**   手机号码*/
    private String phoneNumber;

    /** 用户性别*/
    private String sex;

    /** 用户头像*/
    private String avatar;

    /** 密码*/
    private String password;

    /** 状态*/
   private String status;

    public SysUser(long id, String workId, Date createTime, String loginName, String userName, String userType, String email, String phoneNumber, String sex, String avatar, String password, String status) {
        this.id = id;
        this.workId = workId;
        this.createTime = createTime;
        this.loginName = loginName;
        this.userName = userName;
        this.userType = userType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.avatar = avatar;
        this.password = password;
        this.status = status;
    }

    public SysUser() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", workId='" + workId + '\'' +
                ", createTime=" + createTime +
                ", loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", userType='" + userType + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex='" + sex + '\'' +
                ", avatar='" + avatar + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
