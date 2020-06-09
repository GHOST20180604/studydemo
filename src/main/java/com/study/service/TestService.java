package com.study.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.study.dao.DemoMapper;
import com.study.dao.TestDao;
import com.study.entity.Demo;
import com.study.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;


    public List<TestEntity> getList() {
        return testDao.getList();
    }


}