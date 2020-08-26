package com.example.demo.dao;

import com.example.demo.entity.ga;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GaDao {
//    查询收款信息
    @Select("select * from ga")
    List<ga> query();
//    根据收款方式类型查询
    @Select("select * from ga where gaId = #{gaId}")
    List<ga> typequery();
//    删除此收款方式
    @Delete("delete from ga where gaId = #{gaId}")
    int del(Integer gaId);
//    添加收款方式
    @Insert("insert into ga (gaIcard,gaTypeId) values (#{gaIcard},#{gaTypeId})")
    int addGa(ga ga);
//    修改收款方式
    @Update("update ga set gaIcard = #{gaIcard},gaTypeId = #{gaTypeId} where gaId = #{gaId}")
    int update(ga ga);
}
