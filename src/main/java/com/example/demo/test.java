package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class test{
    @GetMapping("/index")
    public String TestForm(){
        return "/index";
    }

}
