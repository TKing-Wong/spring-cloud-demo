package com.jason.eureka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangt on 2017-07-08 .
 */
@RestController
public class ComputeController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add() {
        logger.info("client Hello World");
        return "Hello World";
    }


}
