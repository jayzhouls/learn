package com.ft.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程调用用户系统
 */
@FeignClient(value = "learn-shop-admin-user", fallback = TestUserHystric.class)
public interface TestUserRemote {

    /**
     * 根据用户名称查询用户信息
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/testUser/indexUser")
    String indexClient(@RequestParam(value = "name") String name);
}
