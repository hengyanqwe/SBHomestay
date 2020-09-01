package com.example.demo.service;

import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import com.example.demo.entity.Jur;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
}
