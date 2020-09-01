package com.example.demo.controller;

import com.example.demo.dao.ComplaintDao;
import com.example.demo.entity.Complaint;
import org.omg.CORBA.PUBLIC_MEMBER;
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
    public List<Complaint> query(){
        List<Complaint> list = complaintDao.query();
        return list;
    }

    @RequestMapping("housequery")
    @ResponseBody
    public List<Complaint> housequery(Integer houseId){
        List<Complaint> list = complaintDao.housequery(houseId);
        return list;
    }

    @RequestMapping("update")
    @ResponseBody 
    public Integer upd(Complaint complaint){
        int upd = complaintDao.upd(complaint);
        return upd;
    }
}
