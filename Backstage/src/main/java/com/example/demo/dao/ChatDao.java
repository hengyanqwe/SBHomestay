package com.example.demo.dao;

import com.example.demo.entity.Chat;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ChatDao {
    @Select("select * from chat")
    List<Chat> query();
}
