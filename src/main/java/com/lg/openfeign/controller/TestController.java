package com.lg.openfeign.controller;

import com.lg.openfeign.common.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 正能量导师
 * @date 2022/6/16-9:37
 * @Description
 */
@RestController
public class TestController {

    @Autowired
    private UserClient userClient;

    @RequestMapping("/getUserInfo")
    public String getUserInfo(){
        String str = userClient.userInfo("1");
        System.out.println(str);
        return str;
    }
}
