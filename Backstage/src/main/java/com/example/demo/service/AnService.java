package com.example.demo.service;

import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AnService {

    @Resource
    AnDao ad;

    //按编号查找
    public An ByAnNumber(String AnNumber){
        return ad.ByAnNumber(AnNumber);
    }
}
