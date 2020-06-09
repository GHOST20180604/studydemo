package com.study.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.study.dao.DemoMapper;
import com.study.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @ProjectName: studydemo
 * @Package: com.study.service
 * @ClassName: hanyunchuan
 * @Author: admin
 * @Description:
 * @Date: 2020/6/8 16:49
 * @Version: 1.0
 */
@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public HashMap<String, Object> getDemoList(Integer pageNum, Integer pageSize) {
        HashMap<String, Object> map = new HashMap<>();
        PageHelper.startPage(pageNum, pageSize);

        Page<Demo> userList = demoMapper.getDemoList();
        int pageNum1 = userList.getPageNum();
        int pageSize1 = userList.getPageSize();
        long total = userList.getTotal();
        System.out.println(pageNum1 + "--" + pageSize1 + "--" + total);
        map.put("userList", userList);
        map.put("pageNum", userList.getPageNum());
        map.put("pageSize", userList.getPageSize());
        map.put("total", userList.getTotal());
        return map;
    }
}
