package com.jason.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangt on 2017-07-09 .
 */
@FeignClient(value = "compute-service", fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    String add();
---------------------------
}
