package com.json.wechat.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.json.wechat.WechatApplication;
import com.json.wechat.entity.Area;
import com.json.wechat.service.AreaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceImplTest {
    @Resource
    private AreaService areaService;
    @Resource
    private WechatApplication wechatApplication;

    @Test
    public void queryArea() {
        List<Area> areas = areaService.queryArea();
        System.out.println(JSONObject.toJSON(areas));
    }

    @Test
    public void queryAreaById() {
    }

    @Test
    public void createArea() {
    }

    @Test
    public void updateArea() {
    }

    @Test
    public void deleteArea() {
    }
}