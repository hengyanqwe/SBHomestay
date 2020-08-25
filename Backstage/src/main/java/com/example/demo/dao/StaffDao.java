package com.example.demo.dao;

import com.example.demo.entity.Staff;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StaffDao {
    @Select("select * from staff")
    List<Staff> query();
    @Select("select * from staff where postId = #{postId}")
    List<Staff> postquery(Integer postId);
    @Delete("delete from staff where staffid = #{staffid}")
    int del(@Param("staffid") Integer staffid);
    @Insert("insert into staff (staffName,postId) values(#{staffName},#{postId})")
    int addStaff(@Param("staff") Staff staff);
    @Update("update staff set staffName = #{staffName},postId = #{postId} where staffid = #{staffid}")
    int update(@Param("staff") Staff staff);
}
