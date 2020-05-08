package com.mtcarpenter.getway.cloud.server.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mtcarpenter
 * @github https://github.com/mtcarpenter/spring-cloud-learning
 * @desc 微信公众号：山间木匠
 */
@RestController
@RequestMapping("/route")
public class RouteTestController {

    @GetMapping(value = "/echo/{name}")
    public String echo(@PathVariable String name) {
        return "8090:"+name;
    }

}