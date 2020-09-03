package com.example.demo.dao;

import com.example.demo.entity.Inform;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InformDao {
//    根据通知人查询通知
    @Select("select * from inform")
    List<Inform> query();
//    删除通知（前台）
    @Delete("delete from inform where informId = #{param1}")
    int del(@Param("informId") Integer informId);
    //    添加警告通知（后台）
    @Insert("insert into inform (informTitle,informContent,informDate,userId) values('系统提示','您的房源已被用户投诉，请查看房源与实际情况是否相符',now(),(select userId from user where houseId=#{param1}))")
    int addInform1(@Param("houseId") Integer houseId);
    //    添加房源下架通知（后台）
    @Insert("insert into inform (informTitle,informContent,informDate,userId) values('系统提示','您的房源已被用户多次投诉，房源已被下架',now(),(select userId from user where houseId=#{param1}))")
    int addInform2(@Param("houseId") Integer houseId);
    //查询历史通知
    @Select("select * from inform i,(select userId from user where houseId=#{param1}) u where i.userId=u.userId")
    List<Inform> Byquery(@Param("houseId") Integer houseId);

    @Update("update Inform set informTitle=#{informTitle},informContent=#{informContent},informDate=now(),userId=#{userId} where informId=#{informId}")
    int update(Inform inform);
}
