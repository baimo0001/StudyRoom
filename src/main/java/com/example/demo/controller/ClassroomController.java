package com.example.demo.controller;


import com.example.demo.exception.Result;
import com.example.demo.service.ClassroomService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class ClassroomController {
    @Resource
    private ClassroomService classroomService;


    /*
      @Description: 根据buildingId获取所有教室
     */
    @GetMapping("/classroom/{buildingId}")
    @ResponseBody
    public String getAllClassroomsByBuilding(@PathVariable Long buildingId) {
        return Result.ok(classroomService.getAllClassroomsByBuilding(buildingId)).toString();
    }
     /*
      @Description: 根据classroomId、Date和time获取所有占用教室
     */
    @GetMapping("/classroom/{classroomId}/{date}/{time}")
    @ResponseBody
    public String getAllOccupiedClassroomByTime(@PathVariable Long classroomId, @PathVariable String date,@PathVariable String time) {
        return Result.ok(classroomService.getAllOccupiedClassroomByTime(classroomId,date, time)).toString();
    }
}
