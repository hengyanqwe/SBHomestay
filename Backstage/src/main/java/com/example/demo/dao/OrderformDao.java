package com.example.demo.dao;

import com.example.demo.entity.Orderform;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderformDao {
    @Select("select * from orderform")
    List<Orderform> query();
}
