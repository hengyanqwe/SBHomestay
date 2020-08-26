package com.example.demo.dao;

import com.example.demo.entity.gaType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GatypeDao {
//    查看收款方式类型
    @Select("select * from gatype")
    List<gaType> query();
//    删除此类型
    @Delete("delete from gatype where gaTypeId = #{gaTypeId}")
    int del(@Param("gaTypeId") Integer gaTypeId);
//    添加类型
    @Insert("insert into gatype (gaTypeName) values (#{gaTypeName})")
    int addGatype(@Param("gatype") gaType gaType);
//    修改类型
    @Update("update gatype set gaTypeName = #{gaTypeName} where gaTypeId = #{gaTypeId}")
    int update(@Param("gatype") gaType gaType);
}
