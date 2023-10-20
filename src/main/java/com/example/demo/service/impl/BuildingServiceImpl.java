package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.exception.exceptions.DataNotFoundException;
import com.example.demo.mapper.BuildingMapper;
import com.example.demo.pojo.Building;
import com.example.demo.service.BuildingService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl extends ServiceImpl<BuildingMapper, Building> implements BuildingService{
    @Resource
    BuildingMapper buildingMapper;
    /*
在building表中根据buildingName获取Id
 */
    @Override
    public List<Building> getBuildingIdByName(String buildingName) {
        Building building = getOne(Wrappers.<Building>lambdaQuery().eq(Building::getBuildingName, buildingName));
        if (building == null) {
            throw new DataNotFoundException("No building named " + buildingName + " found.");
        }
        return list(Wrappers.<Building>lambdaQuery().eq(Building::getBuildingName, buildingName));
    }
}
