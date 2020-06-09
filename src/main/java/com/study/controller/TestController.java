package com.study.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.study.dao.DemoMapper;
import com.study.entity.Demo;
import com.study.entity.TestEntity;
import com.study.service.DemoService;
import com.study.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private DemoService demoService;

    /**
     * 测试运行
     *
     * @return
     */
    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public List<TestEntity> test() {
        List<TestEntity> list = testService.getList();
        return list;
    }
 

}