package com.example.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.pojo.Classroom;

import java.util.List;

public interface ClassroomService extends IService<Classroom> {
    List<Classroom> getAllClassroomsByBuilding(Long buildingId);

    List<Classroom> getAllOccupiedClassroomByTime(Long classroomId, String date, String time);


}
