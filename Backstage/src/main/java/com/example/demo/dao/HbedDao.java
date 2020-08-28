package com.example.demo.dao;

import com.example.demo.entity.Hbed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HbedDao {
    @Select("select * from hd")
    List<Hbed> query();
}
