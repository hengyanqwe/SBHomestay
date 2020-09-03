package com.example.demo.entity;

import java.util.Date;

public class User {
//    用户
//    用户编号
    Integer userId;
//    用户名
    String userName;
//    头像
    String userIcon;
//    手机号码
    String  userPhone;
//    密码
    String userPwd;
//    真实姓名
    String userNames;
//    身份证
    String userIcard;
//    性别
    Integer userSex;
//    出生日期
    Date userDatebirth;
//    所在地区
    String userAddress;
//    血型
    String userBloodtype;
//    教育
    String userTeach;
//    工作
    String userWork;
//    房源编号
    Integer hmId;
//    收款编号
    Integer gaId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserNames() {
        return userNames;
    }

    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    public String getUserIcard() {
        return userIcard;
    }

    public void setUserIcard(String userIcard) {
        this.userIcard = userIcard;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Date getUserDatebirth() {
        return userDatebirth;
    }

    public void setUserDatebirth(Date userDatebirth) {
        this.userDatebirth = userDatebirth;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserBloodtype() {
        return userBloodtype;
    }

    public void setUserBloodtype(String userBloodtype) {
        this.userBloodtype = userBloodtype;
    }

    public String getUserTeach() {
        return userTeach;
    }

    public void setUserTeach(String userTeach) {
        this.userTeach = userTeach;
    }

    public String getUserWork() {
        return userWork;
    }

    public void setUserWork(String userWork) {
        this.userWork = userWork;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userIcon='" + userIcon + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userNames='" + userNames + '\'' +
                ", userIcard=" + userIcard +
                ", userSex=" + userSex +
                ", userDatebirth=" + userDatebirth +
                ", userAddress='" + userAddress + '\'' +
                ", userBloodtype='" + userBloodtype + '\'' +
                ", userTeach='" + userTeach + '\'' +
                ", userWork='" + userWork + '\'' +
                ", hmId=" + hmId +
                ", gaId=" + gaId +
                '}';
    }
}
