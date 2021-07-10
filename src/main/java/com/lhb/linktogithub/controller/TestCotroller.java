package com.lhb.linktogithub.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCotroller {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello LiHaoBiao";
    }


}
