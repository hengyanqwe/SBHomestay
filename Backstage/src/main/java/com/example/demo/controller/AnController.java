package com.example.demo.controller;

import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("An")
public class AnController {
    @Resource
    AnDao ad;

    @ResponseBody
    @RequestMapping("query")
    public List<An> query(String anNumber){
        List<An> list = ad.query(anNumber);
        return list;
    }
    @ResponseBody
    @RequestMapping("failure")
    public String failure(){
        return "error";
    }
    @ResponseBody
    @RequestMapping("getAn1")
    public Object getAn1(){
        return SecurityContextHolder.getContext().getAuthentication();
    }
    @ResponseBody
    @RequestMapping("getAn2")
    public Object getAn2(Authentication authentication){
        return authentication;
    }
    @ResponseBody
    @RequestMapping("getAn3")
    public Object getAn3(Principal principal){
        return principal;
    }
}
