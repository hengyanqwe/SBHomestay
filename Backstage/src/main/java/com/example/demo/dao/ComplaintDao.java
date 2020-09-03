package com.example.demo.dao;

import com.example.demo.entity.Complaint;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ComplaintDao {
//    查看投诉
    @Select("select * from complaint")
    List<Complaint> query();
//    查看被投诉房源
    @Select("select * from complaint where houseId = #{houseId}")
    List<Complaint> housequery(Integer houseId);
//    修改状态
    @Update("update complaint set comState=#{comState} where comId=#{comId}")
    int upd(Integer comId,Integer comState);
}
