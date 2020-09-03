package com.example.demo.controller;

import com.example.demo.dao.HouseDao;
import com.example.demo.entity.House;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("House")
public class HouseController {
    @Resource
    HouseDao hd;

    //查询
    @ResponseBody
    @RequestMapping("query")
    public List<House> query(){
        List<House> query = hd.query();
        System.out.println("query:"+query);
        return query;
    }
    //修改状态
    @ResponseBody
    @RequestMapping("update")
    public int update(Integer houseId){
        System.out.println(houseId);
        int update = hd.update(houseId);
        return update;
    }
}
