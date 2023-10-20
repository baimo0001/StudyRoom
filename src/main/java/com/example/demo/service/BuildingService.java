package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.Building;
import com.example.demo.pojo.Classroom;

import java.util.List;

public interface BuildingService extends IService<Building> {
    List<Building> getBuildingIdByName(String buildingName);
}
