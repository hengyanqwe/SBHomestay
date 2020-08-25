package com.example.demo.dao;

import com.example.demo.entity.complaint;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ComplaintDao {
    @Select("select * from complaint")
    List<complaint> query();
    @Select("select * from complaint where userId = #{userId}")
    List<complaint> userquery();
    @Select("select * from complaint where houseId = #{houseId}")
    List<complaint> housequery();
}
