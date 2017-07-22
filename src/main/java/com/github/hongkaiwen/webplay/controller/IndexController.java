package com.github.hongkaiwen.webplay.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.hongkaiwen.webplay.service.PlayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hongkai on 2017/7/11.
 */
@Controller
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    PlayService playService;

    @GetMapping("/system/version")
    @ResponseBody
    public Object systemVersion(){
        try{
            return playService.systemVersion();
        }catch(Exception e){
            logger.error("system error");
            return "system error";
        }
    }

    @GetMapping("/low/balance/check")
    @ResponseBody
    public Object lowBalanceCheck(@RequestParam String userId){
        String balanceJson = playService.balanceQuery(userId);
        JSONObject balanceInfo = (JSONObject) JSONObject.parse(balanceJson);
        Integer balance = balanceInfo.getInteger("balance");
        return balance > 100;
    }
}
