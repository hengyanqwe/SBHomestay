package com.example.demo.dao;

import com.example.demo.entity.An;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnDao {
    @Select("select * from an where annumber='admin' and anpassword='123456'")
    List<An> query(String annumber, String anpassword);
}
