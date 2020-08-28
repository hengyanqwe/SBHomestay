package com.example.demo.dao;

import com.example.demo.entity.fu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FuDao {
    @Select("select * from fu")
    List<fu> query();
}
