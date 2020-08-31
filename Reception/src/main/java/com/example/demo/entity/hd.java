package com.example.demo.entity;

public class hd {
    //房源描述编号
    Integer hdId;
    //房源标题
    String hdTitle;
    //个性描述
    String Describe;
    //内部情况
    String hdInner;
    //交通情况
    String hdTraffic;
    //周边情况
    String hd;
    //房源编号
    Integer houseId;

    public hd() {
        super();
    }

    public Integer getHdId() {
        return hdId;
    }

    public void setHdId(Integer hdId) {
        this.hdId = hdId;
    }

    public String getHdTitle() {
        return hdTitle;
    }

    public void setHdTitle(String hdTitle) {
        this.hdTitle = hdTitle;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public String getHdInner() {
        return hdInner;
    }

    public void setHdInner(String hdInner) {
        this.hdInner = hdInner;
    }

    public String getHdTraffic() {
        return hdTraffic;
    }

    public void setHdTraffic(String hdTraffic) {
        this.hdTraffic = hdTraffic;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Override
    public String toString() {
        return "hd{" +
                "hdId=" + hdId +
                ", hdTitle='" + hdTitle + '\'' +
                ", Describe='" + Describe + '\'' +
                ", hdInner='" + hdInner + '\'' +
                ", hdTraffic='" + hdTraffic + '\'' +
                ", hd='" + hd + '\'' +
                ", houseId=" + houseId +
                '}';
    }
}
