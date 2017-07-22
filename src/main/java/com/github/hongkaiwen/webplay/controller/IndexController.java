package com.github.hongkaiwen.webplay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by hongkai on 2017/7/11.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/form")
    public String form(HttpServletRequest request, Model model){
        String i_test = request.getParameter("i_test");
        System.out.println(i_test);
        request.getSession(true).setAttribute("msg", i_test);
        return "submit";
    }

    @RequestMapping("/ping")
    @ResponseBody
    public String ping(){
        return "pong";
    }

    @RequestMapping("/302")
    public String t302(){
        return "302";
    }

    @RequestMapping("/forwardPage")
    public String forwardPage(){
        return "forwardPage";
    }

    @RequestMapping("/redirect302")
    public String r302() throws IOException {
        return "redirect:302";
    }

    @RequestMapping("/forward")
    public String r301() throws IOException {
        return "forward:forwardPage";
    }
}
