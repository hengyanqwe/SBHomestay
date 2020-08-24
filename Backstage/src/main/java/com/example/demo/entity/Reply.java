package com.example.demo.entity;

import java.util.Date;

public class Reply {
//    回复
//    回复编号
    Integer replyId;
//    回复内容
    String replyContent;
//    评论编号
    Integer hcId;
//    回复时间
    Date replyDate;
//    用户编号
    Integer userId;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Integer getHcId() {
        return hcId;
    }

    public void setHcId(Integer hcId) {
        this.hcId = hcId;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", replyContent='" + replyContent + '\'' +
                ", hcId=" + hcId +
                ", replyDate=" + replyDate +
                ", userId=" + userId +
                '}';
    }
}
