package com.example.demo.dao;

import com.example.demo.entity.Special;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SpecialDao {
    @Select("select * from special")
    List<Special> query();
    @Select("select * from special where houseId = #{houseId}")
    List<Special> housequery();
    @Delete("delete from special where specialId = #{specialId}")
    int del(@Param("specialId") Integer specialId);
    @Insert("insert into special (specialPrice,specialDate,houseId,specialStop) values" +
            "(#{specialPrice},#{specialDate},#{houseId},#{specialStop})")
    int addSpecial(@Param("special") Special special);
    @Update("update special set specialPrice = #{specialPrece}, specialDate = #{specialDate}," +
            "houseId = #{houseId},specialStop = #{specialStop} where specialId = #{specialId}")
    int update(@Param("special") Special special);
}
