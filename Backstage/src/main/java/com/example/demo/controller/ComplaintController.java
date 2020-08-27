package com.example.demo.controller;

import com.example.demo.dao.ComplaintDao;
import com.example.demo.entity.complaint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Complaint")
public class ComplaintController {
    @Resource
    ComplaintDao complaintDao;

    @RequestMapping("query")
    @ResponseBody
    public List<complaint> query(){
        List<complaint> list = complaintDao.query();
        return list;
    }

    @RequestMapping("userquery")
    @ResponseBody
    public List<complaint> userquery(Integer userId){
        List<complaint> list = complaintDao.userquery(userId);
        return list;
    }

    @RequestMapping("housequery")
    @ResponseBody
    public List<complaint> housequery(Integer houseId){
        List<complaint> list = complaintDao.housequery(houseId);
        return list;
    }
}
