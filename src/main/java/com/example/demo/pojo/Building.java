package com.example.demo.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("building")

public class Building {
    @TableId
    private Integer BuildingId;

    private String BuildingName;
    private String Campus;

    public Integer getBuildingId() { return BuildingId; }

    public void setBuildingId(Integer buildingId) { this.BuildingId = buildingId; }

    public String getBuildingName() { return BuildingName; }

    public void setBuildingName(String buildingName) { this.BuildingName = buildingName; }

    public String getCampus() { return Campus; }

    public void setCampus(String campus) { this.Campus = campus; }
}
