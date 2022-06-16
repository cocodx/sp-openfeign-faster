package com.lg.openfeign.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 正能量导师
 * @date 2022/6/16-9:35
 * @Description
 */
public interface UserApi {

    @GetMapping("/")
    public String userInfo(@RequestParam("userId")String userId);
}
