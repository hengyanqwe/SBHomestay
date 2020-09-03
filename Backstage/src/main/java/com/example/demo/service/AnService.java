package com.example.demo.service;

import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import com.example.demo.entity.Jur;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnService {

    @Resource
    AnDao ad;

    //按编号查找
    public An ByAnNumber(String AnNumber){
        return ad.ByAnNumber(AnNumber);
    }
    public List<Jur> ByjurFun(String jurName)
    {
        return ad.ByjurFun(jurName);
    }
    List<Jur> sss=new ArrayList<Jur>();
    public void jurfun(String str)
    {
        List<Jur> funlist= ad.ByjurFun(str);
        System.out.println("funlist:"+funlist.size());
        for (Jur j:funlist)
        {
            sss.add(j);
//            System.out.println(j+","+as.ByjurFun(j.getJurfun()));
            if (ad.ByjurFun(j.getJurfun()).size()!=0)
            {
                jurfun(j.getJurfun());
            }
        }
        System.out.println("sss"+sss.size());
    }
    public List<Jur> getjurs(){
        return sss;
    }
    public void initjurs(){
        sss=new ArrayList<Jur>();
    }
}
