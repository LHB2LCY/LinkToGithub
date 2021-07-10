package com.lhb.linktogithub.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCotroller {


    /*
    * 第一行代码
    * */
    @GetMapping("/hello")
    public String sayHello(){
        return "hello LiHaoBiao";
    }


}
