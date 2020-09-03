package com.example.demo.entity;

import java.util.Date;

public class Inform {
//    通知
//    通知编号
    Integer informId;
//    通知标题
    String informtitle;
//    通知内容
    String informContent;
//    通知时间
    Date informDate;
//    被通知人
    Integer userId;

    public Integer getInformId() {
        return informId;
    }

    public void setInformId(Integer informId) {
        this.informId = informId;
    }

    public String getInformtitle() {
        return informtitle;
    }

    public void setInformtitle(String informtitle) {
        this.informtitle = informtitle;
    }

    public String getInformContent() {
        return informContent;
    }

    public void setInformContent(String informContent) {
        this.informContent = informContent;
    }

    public Date getInformDate() {
        return informDate;
    }

    public void setInformDate(Date informDate) {
        this.informDate = informDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Inform{" +
                "informId=" + informId +
                ", informtitle='" + informtitle + '\'' +
                ", informContent='" + informContent + '\'' +
                ", informDate=" + informDate +
                ", userId=" + userId +
                '}';
    }
}
