package com.example.demo.dao;

import com.example.demo.entity.Staff;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StaffDao {
//    查看职员
    @Select("select * from staff")
    List<Staff> query();
//    根据职位查看
    @Select("select * from staff where postId = #{postId}")
    List<Staff> postquery(Integer postId);
//    开除职员
    @Delete("delete from staff where staffid = #{staffid}")
    int del(Integer staffid);
//    添加职员
    @Insert("insert into staff (staffName,postId,idcard,state) values(#{staffName},#{postId},#{idcard},1)")
    int addStaff(Staff staff);
//    更改状态
    @Update("update staff set state = #{state} where staffid = #{staffid}")
    int stateupdate(Staff staff);
//    更改信息
    @Update("update staff set staffName = #{staffName},postId = #{postId},idcard = #{idcard},state = #{state} where staffid = #{staffid}")
    int update(Staff staff);
}
