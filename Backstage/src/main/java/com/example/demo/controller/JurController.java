package com.example.demo.controller;

import com.example.demo.dao.JurDao;
import com.example.demo.entity.Jur;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("Jur")
public class JurController {
    @Resource
    JurDao jurDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Jur> query(){
        List<Jur> list = jurDao.query();
        return list;
    }

    @RequestMapping("add")
    @ResponseBody
    public int add(Jur jur){
        int i = jurDao.addJur(jur);
        return i;
    }

    @RequestMapping("del")
    @ResponseBody
    public int del(Integer jurId){
        int i = jurDao.del(jurId);
        return i;
    }

    @RequestMapping("update")
    @ResponseBody
    public int update(Jur jur){
        int i = jurDao.update(jur);
        return i;
    }
}
