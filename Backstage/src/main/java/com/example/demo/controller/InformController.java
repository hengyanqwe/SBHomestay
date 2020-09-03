package com.example.demo.controller;

import com.example.demo.dao.InformDao;
import com.example.demo.entity.Inform;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("inform")
@CrossOrigin
@Controller
public class InformController {

    @Resource
    InformDao ind;

    @ResponseBody
    @RequestMapping("query")
    public List<Inform> query(){
        List<Inform> query = ind.query();
        return query;
    }
}
