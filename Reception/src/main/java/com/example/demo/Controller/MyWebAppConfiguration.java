package com.example.demo.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebAppConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * @Description: 对文件的路径进行配置,创建一个虚拟路径/Path/** ，即只要在<img src="/Path/picName.jpg" />便可以直接引用图片
         *这是图片的物理路径 "file:/+本地图片的地址"
         * @Date： Create in 14:08 2017/12/20
         */
        registry.addResourceHandler("/Path/**").addResourceLocations("file:/D:/A1212/IDEA/SBHomestay/Reception/src/main/resources/templates/");
        registry.addResourceHandler("/Portrait/**").addResourceLocations("file:/E:/project/portrait/");
        registry.addResourceHandler("/House/**").addResourceLocations("file:/E:/project/house/");
        super.addResourceHandlers(registry);

    }

}