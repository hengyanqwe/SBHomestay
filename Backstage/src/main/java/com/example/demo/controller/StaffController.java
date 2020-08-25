package com.example.demo.controller;

import com.example.demo.dao.StaffDao;
import com.example.demo.entity.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Staff")
public class StaffController {
    @Resource
    StaffDao staffDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Staff> query(){
        List<Staff> list = staffDao.query();
        return list;
    }

    @RequestMapping("postquery")
    @ResponseBody
    public List<Staff> postquery(Integer postId){
        List<Staff> list = staffDao.postquery(postId);
        return list;
    }

    @RequestMapping("add")
    @ResponseBody
    public int addStaff(Staff staff){
        int i = staffDao.addStaff(staff);
        return i;
    }

    @RequestMapping("del")
    @ResponseBody
    public int del(Integer staffid){
        int i = staffDao.del(staffid);
        return i;
    }

    @RequestMapping("update")
    @ResponseBody
    public int update(Staff staff){
        int i =staffDao.update(staff);
        return i;
    }
}
