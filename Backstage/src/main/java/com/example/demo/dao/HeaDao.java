package com.example.demo.dao;

import com.example.demo.entity.hea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HeaDao {
    @Select("select * from hea")
    List<hea> query();
}
