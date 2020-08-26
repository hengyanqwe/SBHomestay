package com.example.demo.dao;

import com.example.demo.entity.complaint;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ComplaintDao {
//    查看投诉
    @Select("select * from complaint")
    List<complaint> query();
//    根据用户查看投诉
    @Select("select * from complaint where userId = #{userId}")
    List<complaint> userquery();
//    查看房源投诉
    @Select("select * from complaint where houseId = #{houseId}")
    List<complaint> housequery();
}
