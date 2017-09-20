package com.github.hongkaiwen.webplay.service;

import org.springframework.stereotype.Service;

/**
 * Created by player on 2017/7/22.
 */
@Service
public class PlayService  {

    public String systemVersion(){
        throw new RuntimeException("ssss");
    }

    public String balanceQuery(String userId){
        //call third party interface, expect json data
        return "<html><body>500 Internal Error: xxxxx</body></html>";
    }


}
