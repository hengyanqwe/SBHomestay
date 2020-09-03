package com.example.demo.dao;

import com.example.demo.entity.Hm;
import com.example.demo.entity.House;
import com.example.demo.entity.hd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface HouseDao {
    //查看
    @Select("select h.houseId,m.hmRegion,u.userName,h.houseState from house h,hm m,user u where h.houseId=m.houseId and h.userId=u.userId")
    List<House> query();
    //    查看房源信息
    @Select("select hm.hmId,hmRegion,hmAddress,hmNumber,htName,hmRo,hmTypeone,hmTypetwo,hmTypethree,hmTypefour,hmTypefive,hmRA,bedType,hmToilet,hmPeople " +
            "from (select * from hm) hm,ht t,bed e where hm.htId=t.htId and hm.bedId=e.bedId;")
    List<Hm> housequery();
    //    房源描述
    @Select("select * from hd where houseId=1")
    List<hd> hdquery();
    //    房源设施
    @Select("select GROUP_CONCAT(brName SEPARATOR ',') brName,\n" +
            "\t\t(select GROUP_CONCAT(eaName SEPARATOR ',') eaName from ea a,(select * from hea where houseId=#{houseId}) ea where ea.eaId=a.eaId) eaName,\n" +
            "\t\t(select GROUP_CONCAT(hfName SEPARATOR ',') hfName from hf f,(select * from hhf where houseId=#{houseId}) hf where hf.hfId=f.hfId) hfName  \n" +
            "from br b,(select * from hbr where houseId=#{houseId}) br \n" +
            "where br.brId=b.brId;")
    List<Hm> housefac(Integer houseId);
    //    房源照片
    @Select("select GROUP_CONCAT(picURL SEPARATOR ',') picURL from pic i,(select * from hi where houseId=1) hi where i.picId=hi.picId;")
    List<Map> housepic();
    //    房源价格
    @Select("select * from hp")
    List<Map> househp();
    //  下架
    @Update("update house set houseState=1 where houseId=#{houseId}")
    int update(Integer houseId);
}
