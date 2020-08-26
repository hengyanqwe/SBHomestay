package com.example.demo.dao;

import com.example.demo.entity.An;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface AnDao extends tk.mybatis.mapper.common.Mapper<An> {

    @Select("select * from an where anNumber=#{AnNumber};")
    public An ByAnNumber(String AnNumber);
    @Select("select * from an;")
    public List<An> query(String AnNumber);
}
