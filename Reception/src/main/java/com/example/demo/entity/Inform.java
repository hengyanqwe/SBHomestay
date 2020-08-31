package com.example.demo.entity;

import java.util.Date;

public class Inform {
//    通知
//    通知编号
    Integer informId;
//    通知标题
    String informtitle;
//    通知内容
    String informCOntent;
//    通知时间
    Date informDate;
//    被通知人
    Integer informPeople;

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

    public String getInformCOntent() {
        return informCOntent;
    }

    public void setInformCOntent(String informCOntent) {
        this.informCOntent = informCOntent;
    }

    public Date getInformDate() {
        return informDate;
    }

    public void setInformDate(Date informDate) {
        this.informDate = informDate;
    }

    public Integer getInformPeople() {
        return informPeople;
    }

    public void setInformPeople(Integer informPeople) {
        this.informPeople = informPeople;
    }

    @Override
    public String toString() {
        return "Inform{" +
                "informId=" + informId +
                ", informtitle='" + informtitle + '\'' +
                ", informCOntent='" + informCOntent + '\'' +
                ", informDate=" + informDate +
                ", informPeople=" + informPeople +
                '}';
    }
}
