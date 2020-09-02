package com.example.demo.dao;

import com.example.demo.entity.cs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CsDao {
    @Select("select * from cs")
    List<cs> query();
}
