package com.example.demo.controller;

import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("An")
public class AnController {
    @Resource
    AnDao ad;

    /**
     * 按编号查询
     * @param anNumber
     * @return
     */
    @ResponseBody
    @RequestMapping("ByAnNumber")
    public An ByAnNumber(String anNumber){
        return ad.ByAnNumber(anNumber);
    }

    /**
     * 查询
     * @return
     */
    @ResponseBody
    @RequestMapping("query")
    public List<An> query(){
        System.out.println(ad.query());
        return ad.query();
    }

    /**
     * 添加
     * @param an
     * @return
     */
    @ResponseBody
    @RequestMapping("add")
    public int add(An an){
        System.out.println(an);
        return ad.add(an);
    }

    /**
     * 修改
     * @param an
     * @return
     */
    @ResponseBody
    @RequestMapping("update")
    public void udpate(An an){
        System.out.println(an);
        ad.update(an);
    }

    /**
     * 删除
     * @param anId
     * @return
     */
    @ResponseBody
    @RequestMapping("delete")
    public void delete(Integer anId){
        ad.del(anId);
    }
}
