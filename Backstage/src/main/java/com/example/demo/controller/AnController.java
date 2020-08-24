package com.example.demo.controller;

import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("An")
public class AnController {
    @Resource
    AnDao ad;

    @ResponseBody
    @RequestMapping("query")
    public List<An> query(String annumber, String anpassword){
        List<An> list = ad.query(annumber, anpassword);
        return list;
    }
}
