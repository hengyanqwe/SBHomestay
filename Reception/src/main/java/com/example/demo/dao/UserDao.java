package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
//    查看用户
    @Select("select * from user")
    List<User> query();
//    根据账号查询（前台）
    @Select("select * from user where userPhone = #{userPhone} and userPwd = #{userPwd}")
    List<User> phonequery(String userPhone,String userPwd);
//    根据收款编号查看
    @Select("select * from user where gaId = #{gaId}")
    List<User> gaquery(Integer gaId);
//    根据房源编号查看
    @Select("select * from user where hmId = #{hmId}")
    List<User> hmquery(Integer hmId);
//    注销账号
    @Delete("delete from user where userId = #{userId}")
    int del(Integer userId);
//    注册
    @Insert("insert into user (userName,userPhone,userPwd) values (#{userName},#{userPhone},#{userPwd})")
    int addUser(User user);
//    更改用户信息
    @Update("update user set userName = #{userName},userIcon = #{userIcon},userPhone = #{userPhone},userPwd = #{userPwd}," +
            "userNames = #{userNames},userIcard = #{userIcard},userSex = #{userSex},userDatebirth = #{userDatebirth}," +
            "userAddress = #{userAddress},userBloodtype = #{userBloodtype},userTeach = #{userTeache}," +
            "userWork = #{userWork},hmId = #{hmId},gaId = #{gaId} where userId = #{userId}")
    int update(User user);
}
