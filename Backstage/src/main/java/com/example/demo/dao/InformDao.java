package com.example.demo.dao;

import com.example.demo.entity.Inform;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InformDao {
//    根据通知人查询通知
    @Select("select * from inform where informPeople = #{informPeople")
    List<Inform> peoplequery();
//    删除通知（前台）
    @Delete("delete from inform where informId = #{informId}")
    int del(Integer informId);
//    添加通知（后台）
    @Insert("insert into inform (informTitle,informContent,informDate,informPeople) values" +
            "(#{informTitle},#{informContent},#{informDate},#{informPeople})")
    int addInform(Inform inform);
}
