package com.example.demo.service;

import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import com.example.demo.entity.Jur;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnService2 {

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
    public void jurfun(List<Jur> jurs)
    {
        for (Jur jj:jurs)
        {
            List<Jur> funlist= ad.ByjurFun(jj.getJurfun());
            System.out.println("funlist:"+funlist.size());
            System.out.println("jj"+jj);
            for (Jur j:funlist)
            {
                System.out.println("j"+j);
                //sss.add(j);
//          System.out.println(j+","+as.ByjurFun(j.getJurfun()));
                if (ad.ByjurFun(j.getJurfun()).size()!=0)
                {
                    List<Jur> taowa=new ArrayList<Jur>();
                    taowa.add(j);
                    jurfun(taowa);
                }
                System.out.println(jj.getJurs());
                if (null==jj.getJurs())
                {
                    jj.setJurs(new ArrayList<Jur>());
                    jj.addJurs(j);
                }else{
                    jj.addJurs(j);
                }
            }
            System.out.println("sss"+sss);
        }

    }
    public List<Jur> getjurs(){
        return sss;
    }
    public void initjurs(){
        sss=new ArrayList<Jur>();
    }
}
