package com.k8s.deploy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/1/15 17:38
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/env")
public class EnvTestController {

    @Value("${TEST_NAME_KEY:SHOUZHI}")
    private String name;

    @Value("${TEST_ADDR_KEY:浙江省杭州市}")
    private String addr;

    @GetMapping("/name")
    public Object name(){
        log.info("TEST_NAME_KEY={}", name);
        return name;
    }

    @GetMapping("/addr")
    public Object addr(){
        log.info("TEST_ADDR_KEY={}", addr);
        return addr;
    }


}
