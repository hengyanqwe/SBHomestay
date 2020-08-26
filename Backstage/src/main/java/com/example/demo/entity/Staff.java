package com.example.demo.entity;

public class Staff {
//    职员
//    职员编号
    Integer staffid;
//    职员名称
    String staffName;
//    职位编号
    Integer postId;
//    身份证号
    String idcard;
//    是否在职
    Integer state;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffid=" + staffid +
                ", staffName='" + staffName + '\'' +
                ", postId=" + postId +
                ", idcard='" + idcard + '\'' +
                ", state=" + state +
                '}';
    }
}
