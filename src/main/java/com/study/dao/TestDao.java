package com.study.dao;

import com.study.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {

    List<TestEntity> getList();
}