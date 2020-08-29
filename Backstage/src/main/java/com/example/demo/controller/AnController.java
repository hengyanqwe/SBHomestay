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
     * 按用户名密码登录查询
     * @param anNumber
     * @return
     */
    @ResponseBody
    @RequestMapping("login")
    public An ByAnNumber(String anNumber,String anPassword){
        System.out.println("anNumber:"+anNumber);
        System.out.println("anPassword:"+anPassword);
        return ad.login(anNumber,anPassword);
    }

    /**
     * 按用户名登录查询
     * @param anNumber
     * @return
     */
    @ResponseBody
    @RequestMapping("AnNumber")
    public int AnNumber(String anNumber){
        System.out.println("anNumber:"+anNumber);
        List<An> ans = ad.AnNumber(anNumber);
        if (ans.size()==0){
            return 0;
        }
        return ans.size();
    }

    /**
     * UserConfig使用anNumber查询
     * @param anNumber
     * @return
     */
    @ResponseBody
    @RequestMapping("ByanNumber")
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