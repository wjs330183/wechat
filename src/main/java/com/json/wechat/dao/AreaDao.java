package com.json.wechat.dao;

import com.json.wechat.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * @return
     */
    List<Area> queryArea();

    /**
     * @param areaId
     * @return
     */
    Area queryAreaById(String areaId);

    /**
     * @param area
     * @return
     */
    int createArea(Area area);

    /**
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * @param areaId
     * @return
     */
    int deleteArea(String areaId);
}
