package com.fst.cloudweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Dash
 * @Description code life
 * @Author zeef
 * @Date 2019\7\8 0008 12:00
 * @Version 1.0
 * @UPDATE
 **/
@RestController
public class Dash {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/gateway")
    @ResponseBody
    public String gateWay() {
        return "成功返回" + port;
    }

    @ResponseBody
    @RequestMapping(value = "/toDemoResBody")
    public String toDemoResBody(@RequestParam(value = "name", defaultValue = "fst") String name) {
        return "您好~" + name + "，您此次访问WEB服务的端口是：" + port;
    }

}
