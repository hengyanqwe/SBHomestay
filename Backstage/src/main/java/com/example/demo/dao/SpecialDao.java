package com.example.demo.dao;

import com.example.demo.entity.Special;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SpecialDao {
//    查看特殊价格
    @Select("select * from special")
    List<Special> query();
//    根据房源编号查看
    @Select("select * from special where houseId = #{houseId}")
    List<Special> housequery();
//    删除特殊价格
    @Delete("delete from special where specialId = #{specialId}")
    int del(Integer specialId);
//    添加
    @Insert("insert into special (specialPrice,specialDate,houseId,specialStop) values" +
            "(#{specialPrice},#{specialDate},#{houseId},#{specialStop})")
    int addSpecial(Special special);
//    更改信息
    @Update("update special set specialPrice = #{specialPrece}, specialDate = #{specialDate}," +
            "houseId = #{houseId},specialStop = #{specialStop} where specialId = #{specialId}")
    int update(Special special);
}
