package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user")
    List<User> query();
    @Select("select COUNT(userId) from user where userPhone = #{uname} and userPwd = #{upwd}")
    int loginNamePwd(@Param("uname") String userPhone, @Param("upwd") String userPwd);
    @Select("select * from user where gaId = #{gaId}")
    List<User> gaquery(Integer gaId);
    @Select("select * from user where hmId = #{hmId}")
    List<User> hmquery(Integer hmId);
    @Delete("delete from user where userId = #{userId}")
    int del(@Param("userId") Integer userId);
    @Insert("insert into user (userName,userPhone,userPwd) values (#{userName},#{userPhone},#{userPwd})")
    int addUser(@Param("user") User user);
    @Update("update user set userName = #{userName},userIcon = #{userIcon},userPhone = #{userPhone},userPwd = #{userPwd}," +
            "userNames = #{userNames},userIcard = #{userIcard},userSex = #{userSex},userDatebirth = #{userDatebirth}," +
            "userAddress = #{userAddress},userBloodtype = #{userBloodtype},userTeach = #{userTeache}," +
            "userWork = #{userWork},hmId = #{hmId},gaId = #{gaId} where userId = #{userId}")
    int update(@Param("user") User user);
}
