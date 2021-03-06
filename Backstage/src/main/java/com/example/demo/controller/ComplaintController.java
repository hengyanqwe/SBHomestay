package com.example.demo.controller;

import com.example.demo.dao.ComplaintDao;
import com.example.demo.dao.InformDao;
import com.example.demo.entity.Complaint;
import com.example.demo.entity.Inform;
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
    public Integer upd(Integer comId,Integer comState){
        int upd = complaintDao.upd(comId,comState);
        return upd;
    }

    @Resource
    InformDao ind;

    @RequestMapping("InformAdd1")
    @ResponseBody
    public Integer InformAdd1(Integer houseId){
        int i = ind.addInform1(houseId);
        return i;
    }
    @RequestMapping("InformAdd2")
    @ResponseBody
    public Integer InformAdd2(Integer houseId){
        int i = ind.addInform2(houseId);
        return i;
    }
    @RequestMapping("Byquery")
    @ResponseBody
    public List<Inform> Byquery(Integer houseId){
        List<Inform> byquery = ind.Byquery(houseId);
        return byquery;
    }
}
