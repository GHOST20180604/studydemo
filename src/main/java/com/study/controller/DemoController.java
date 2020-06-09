package com.study.controller;

import com.study.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/demoTest")
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/getListByPage", method = RequestMethod.GET)
    public Map test2(Integer pageNum, Integer pageSize) {
        Map demoList = demoService.getDemoList(pageNum, pageSize);
        logger.debug("logger.debug");
        logger.info("logger.info");
        logger.error("logger.error");
        return demoList;
    }

}