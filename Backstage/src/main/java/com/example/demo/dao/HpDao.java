package com.example.demo.dao;

import com.example.demo.entity.Hp;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HpDao {
//    查看房源价格
    @Select("select * from hp")
    List<Hp> query();
//    根据房源编号查看价格
    @Select("select * from hp where houseId = #{houseId")
    List<Hp> hpquery(Integer houseId);
//    添加房源价格
    @Insert("insert into hp (hpPrice,hpTr,hpMind,hpMaxd,houseId) values" +
            "(#{hpPrice},#{hpTr},#{hpMind},#{hpMaxd},#{houseId})")
    int addHp(@Param("hp") Hp hp);
//    更改房源价格
    @Update("update hp set hpPrice = #{hpPrice},hpTr = #{hpTr},hpMind = #{hpMind},hpMaxd = #{hpMaxd},houseId = #{houseId}" +
            "where hpId = #{hpId}")
    int update(@Param("hp") Hp hp);
}
