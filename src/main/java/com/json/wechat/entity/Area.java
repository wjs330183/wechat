package com.json.wechat.entity;

import java.util.Date;

public class Area {

    private String id;
    private String areaId;
    private String areaName;
    private String priority;
    private Integer sysDeleted;
    private Date sysCreateTime;
    private String sysCreator;
    private Date sysUpdateTime;
    private String sysUpdater;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getSysDeleted() {
        return sysDeleted;
    }

    public void setSysDeleted(Integer sysDeleted) {
        this.sysDeleted = sysDeleted;
    }

    public Date getSysCreateTime() {
        return sysCreateTime;
    }

    public void setSysCreateTime(Date sysCreateTime) {
        this.sysCreateTime = sysCreateTime;
    }

    public String getSysCreator() {
        return sysCreator;
    }

    public void setSysCreator(String sysCreator) {
        this.sysCreator = sysCreator;
    }

    public Date getSysUpdateTime() {
        return sysUpdateTime;
    }

    public void setSysUpdateTime(Date sysUpdateTime) {
        this.sysUpdateTime = sysUpdateTime;
    }

    public String getSysUpdater() {
        return sysUpdater;
    }

    public void setSysUpdater(String sysUpdater) {
        this.sysUpdater = sysUpdater;
    }
}
