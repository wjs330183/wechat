package com.json.wechat.service.impl;

import com.json.wechat.dao.AreaDao;
import com.json.wechat.entity.Area;
import com.json.wechat.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> queryArea() {
        List<Area> areas = areaDao.queryArea();
        return areas;
    }

    @Override
    public Area queryAreaById(String areaId) {
        Area area = areaDao.queryAreaById(areaId);
        return area;
    }

    @Override
    public int createArea(Area area) {
        int area1 = areaDao.createArea(area);
        return area1;
    }

    @Override
    public int updateArea(Area area) {
        int i = areaDao.updateArea(area);
        return i;
    }

    @Override
    public int deleteArea(String areaId) {
        int i = areaDao.deleteArea(areaId);
        return i;
    }
}
