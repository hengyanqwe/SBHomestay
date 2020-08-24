package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//7
public interface UserDao {
    @Select("select * from an where annumber='admin' and anpassword='123456'")
    public List<User> query(String annumber,String anpassword);
}
