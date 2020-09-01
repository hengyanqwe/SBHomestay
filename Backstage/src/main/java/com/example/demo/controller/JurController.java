package com.example.demo.controller;

import com.example.demo.dao.JurDao;
import com.example.demo.entity.Jur;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Jur")
public class JurController {
    @Resource
    JurDao jurDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Jur> query(){
        List<Jur> list = jurDao.query();
        System.out.println(1111);
        System.out.println(list);
        return list;
    }
    //查询父级Id
    @RequestMapping("ByJurFuId")
    @ResponseBody
    public List<Jur> ByJurFuId(){
        List<Jur> jurs = jurDao.ByjurFuId();
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
