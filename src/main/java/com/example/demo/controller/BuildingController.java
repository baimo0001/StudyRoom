package com.example.demo.controller;

import com.example.demo.exception.Result;
import com.example.demo.service.BuildingService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class BuildingController {
    @Resource
    private BuildingService buildingService;
    /*
        @Description: 根据buildingName获取buildingId
     */
    @GetMapping("/building/{buildingName}")
    @ResponseBody
    public String getBuildingIdByName(@PathVariable String buildingName) {
        return Result.ok(buildingService.getBuildingIdByName(buildingName)).toString();
    }
}
