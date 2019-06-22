package com.example.springboot_002.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowS {


    @RequestMapping(value = {"/hello"})
    public String hello() {


        System.out.println("H----E---L---L---0");

        return "hello";
    }

    @RequestMapping(value = {"/mdv"})
    public ModelAndView mdv() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "jk");
        modelAndView.setViewName("mdv");
        return modelAndView;
    }


}
