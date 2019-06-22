package com.example.springboot_002.controller;

import com.example.springboot_002.biz.UserInfoBizI;
import com.example.springboot_002.enity.UserInfo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = {"/use"})
@Log4j2
public class UserInfoo {

    public UserInfoo() {
        System.out.println("进来了");
    }



    @Autowired
    UserInfoBizI userInfoBizI;


    @RequestMapping(value = {"/userr"})
    public ModelAndView user(@RequestParam Integer uid, @RequestParam String name) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");

        System.out.println("-----------------------------------------------");
        System.out.println(uid + "-------" + name);


        return modelAndView;


    }

    @RequestMapping(value = {"/user"})
    public ModelAndView user(@ModelAttribute UserInfo userInfo) {
        ModelAndView modelAndView = new ModelAndView();


        modelAndView.addObject("userInfo", userInfo);
        modelAndView.setViewName("user");

        System.out.println("xh" + userInfo.getName());
        System.out.println("==================");
        System.out.println(userInfo.toString());


        return modelAndView;


    }
    @RequestMapping(value = {"/search"})
    public ModelAndView search(){

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("search");
        List<UserInfo> user= userInfoBizI.searchall();
        modelAndView.addObject("user",user);

        return modelAndView;
    }
    @RequestMapping(value = {"/add"})
    public ModelAndView add(@ModelAttribute UserInfo userInfo){


        log.info(userInfo+"----------");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("add");
        UserInfo ui=userInfoBizI.save(userInfo);
        List<UserInfo> user= userInfoBizI.searchall();

        modelAndView.addObject("userui",ui);
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
