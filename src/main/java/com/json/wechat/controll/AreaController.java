package com.json.wechat.controll;

import com.json.wechat.entity.Area;
import com.json.wechat.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//=
//@Controller+
//@ResponseBody
@RequestMapping("/")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    private Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> list = areaService.queryArea();
        modelMap.put("areaList", list);
        return modelMap;
    }
    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
    private Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("areaList", areaService.createArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
    private Map<String, Object> modifyArea(@RequestBody Area area) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.updateArea(area));
        return modelMap;
    }


    @RequestMapping(value = "/removearea", method = RequestMethod.GET)
    private Map<String, Object> removeArea(String areaId) {
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.deleteArea(areaId));
        return modelMap;
    }


}
