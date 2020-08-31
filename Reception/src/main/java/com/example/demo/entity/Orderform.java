package com.example.demo.entity;

import java.util.Date;

public class Orderform {
//    订单管理
//    订单编号
    Integer orderId;
//    支付时间
    Date orderDate;
//    房源编号
    Integer houseId;
//    订单总额
    Integer orderPrice;
//    入住状态
    Integer orderState;
//    入住时间
    Date orderDateinto;
//    离店时间
    Date orderDateleave;
//    订单是否完成
    Integer orderYN;
//    常用人编号
    Integer fuId;
//    收款编号
    Integer gaId;
//    支付状态
    Integer orderPay;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getOrderDateinto() {
        return orderDateinto;
    }

    public void setOrderDateinto(Date orderDateinto) {
        this.orderDateinto = orderDateinto;
    }

    public Date getOrderDateleave() {
        return orderDateleave;
    }

    public void setOrderDateleave(Date orderDateleave) {
        this.orderDateleave = orderDateleave;
    }

    public Integer getOrderYN() {
        return orderYN;
    }

    public void setOrderYN(Integer orderYN) {
        this.orderYN = orderYN;
    }

    public Integer getFuId() {
        return fuId;
    }

    public void setFuId(Integer fuId) {
        this.fuId = fuId;
    }

    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }

    public Integer getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(Integer orderPay) {
        this.orderPay = orderPay;
    }

    @Override
    public String toString() {
        return "Orderform{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", houseId=" + houseId +
                ", orderPrice=" + orderPrice +
                ", orderState=" + orderState +
                ", orderDateinto=" + orderDateinto +
                ", orderDateleave=" + orderDateleave +
                ", orderYN=" + orderYN +
                ", fuId=" + fuId +
                ", gaId=" + gaId +
                ", orderPay=" + orderPay +
                '}';
    }
}
