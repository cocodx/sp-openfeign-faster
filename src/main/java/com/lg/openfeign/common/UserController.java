package com.lg.openfeign.common;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author 正能量导师
 * @date 2022/6/16-9:39
 * @Description
 */
@RestController
public class UserController implements UserApi{
    @Override
    public String userInfo(String userId) {
        return "user1"+userId;
    }
}
