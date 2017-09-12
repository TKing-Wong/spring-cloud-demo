package com.jason.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by wangt on 2017-07-09 .
 */
@Component------------------------------------
public class ComputeClientHystrix implements ComputeClient {
    @Override
    public String add() {
        return "-9999";
    }
}
