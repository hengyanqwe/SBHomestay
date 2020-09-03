package com.example.demo.controller;

import com.example.demo.dao.JurDao;
import com.example.demo.entity.Jur;
import com.example.demo.service.AnService;
import com.example.demo.service.AnService2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Jur")
public class JurController {
    @Resource
    JurDao jurDao;
@Resource
    AnService2 as2;
    @RequestMapping("query")
    @ResponseBody
    public List<Jur> query(){
        /*List<Jur> list = jurDao.query();
        System.out.println(1111);
        System.out.println(list);*/
        List<Jur> ls=jurDao.ByJurFuId();
        as2.jurfun(ls);
        return ls;
    }
    //查询父级Id
    @RequestMapping("ByJurFuId")
    @ResponseBody
    public List<Jur> ByJurFuId(){
        List<Jur> jurs = jurDao.ByJurFuId();
        System.out.println();
        return jurs;
    }
    //根据角色编号查询对应的父级权限(子级权限)
    @Resource
    AnService as;
    @RequestMapping("ByJurPath")
    @ResponseBody
    public List<Jur> ByPostId(Integer postId){
        List<Jur> jurs=jurDao.ByPostId(postId);
        as.initjurs();
        for (Jur j:jurs)
        {
            as.jurfun(j.getJurfun());
        }
        List<Jur> jurs2=as.getjurs();
        //System.out.println(jurs2+";jurs2"+jurs2.size());
        for (Jur j:jurs2){
            jurs.add(j);
        }
        System.out.println(jurs+";\n"+jurs.size());
        return jurs;
    }

    @RequestMapping("add")
    @ResponseBody
    public void add(Jur jur){
        System.out.println("添加:"+jur);
        jurDao.addJur(jur);
    }

    @RequestMapping("del")
    @ResponseBody
    public void del(Integer jurid){
        System.out.println("jurid:"+jurid);
        jurDao.del(jurid);
    }

    @RequestMapping("update")
    @ResponseBody
    public void update(Jur jur){
        System.out.println("修改jur:"+jur);
        jurDao.update(jur);
    }
}
