package com.lg.openfeign.common;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 正能量导师
 * @date 2022/6/16-9:36
 * @Description value 目标服务的名称， path声明前置路径
 */
@FeignClient(value = "user",path = "/user",url = "http://localhost:8080")
public interface UserClient extends UserApi {
}
