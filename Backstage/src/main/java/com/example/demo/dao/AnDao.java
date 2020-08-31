package com.example.demo.dao;

import com.example.demo.entity.An;
import com.example.demo.entity.Jur;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface AnDao extends tk.mybatis.mapper.common.Mapper<An> {

    //登录
    @Select("select * from an where anNumber=#{AnNumber} and anPassword=#{anPassword}")
    An login(String AnNumber,String anPassword);
    //账号查找
    @Select("select * from an where anNumber=#{AnNumber}")
    List<An> AnNumber(String AnNumber);
    //Userconfig
    @Select("select p.*,j.jurId,j.jurName ,GROUP_CONCAT(j.jurFun SEPARATOR ',') jur\n" +
            "from (select a.*,pj.jurId from (select * from an where anNumber='${param1}') a,pj pj where a.postId=pj.postId) p,jur j\n" +
            "where p.jurId=j.jurId\n" +
            "group by p.anId")
    An ByAnNumber(@Param("AnNumber") String AnNumber);
    //
    @Select("select j.jurId,j.jurName,j.jurFun from jur j,(select * from jur where jurName=#{jurName}) F where j.jurFuId=F.jurId")
    List<Jur> ByjurFun(String jurName);






    //查询
    @Select("select a.*,p.* from an a,post p where a.postId=p.postId")
    List<An> query();
    //增加
    @Insert("insert into an values(#{anId},#{anNumber},#{anPassword},#{postid})")
    int add(An an);
    //删除
    @Delete("delete from an where anId=#{param1}")
    void del(@Param("anId") Integer anId);
    //修改
    @Update("update an set anPassword=#{anPassword} where anId=#{anId}")
    int update(An an);
}
