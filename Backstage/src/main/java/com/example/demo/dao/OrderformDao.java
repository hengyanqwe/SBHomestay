package com.example.demo.dao;

import com.example.demo.entity.Orderform;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderformDao {
    @Select("select * from orderform")
    List<Orderform> query();
    //查询订单用户
    @Select("select orderform.*,fu.userId from orderform,fu where orderform.fuId = fu.userId")
    List<Orderform> userquery();
    //添加订单
    @Insert("insert into orderform (orderDate,houseId,orderPrice,orderState,orderDateinto,orderDateleave,orderYN,fuId,gaId,orderPay)" +
            "values (#{orderDate},#{houseId},#{orderPrice},0,#{orderDateinto},#{orderDateleave},#{orderYN}," +
            "#{fuId},#{gaId},#{orderPay})")
    int addorder(Orderform orderform);
    //取消订单
    @Delete("delete from orderform where orderId = #{orderId}")
    int del(Integer orderId);
}
