package com.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.study.config.redis.utils.RedisTool;
import com.study.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/demoTest")
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DemoService demoService;
    @Autowired
    private RedisTool redisTool;

    /**
     * 测试分页/测试logger
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/getListByPage", method = RequestMethod.GET)
    public Map test2(Integer pageNum, Integer pageSize) {
        Map demoList = demoService.getDemoList(pageNum, pageSize);
        logger.debug("logger.debug");
        logger.info("logger.info");
        logger.error("logger.error");
        return demoList;
    }

    /**
     * 测试redis
     *
     * @return
     */
    @RequestMapping(value = "/setStringToRedis", method = RequestMethod.GET)
    public String test3() {

        JSONObject jsonObject = new JSONObject();
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        jsonObject.put("jsonkey1", "josnValue1");
        redisTool.set("strkey1", "value1");
        redisTool.hset("hashkey1", "field1", "value1");
        redisTool.lSet("listkey1", list);
        return null;
    }

}