package com.example.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

    @RequestMapping("/user")
    public String getUser() {
        // conectar base de dados
        //trazer dados do usuario
        return "dados de usuario";
    }

    @RequestMapping("/")
    public String index() {
        return "pepino";
    }
}
