package com.json.wechat.service;

import com.json.wechat.entity.Area;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AreaService {
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
