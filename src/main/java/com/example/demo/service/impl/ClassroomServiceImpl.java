package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.exception.exceptions.DataNotFoundException;
import com.example.demo.mapper.ClassroomMapper;
import com.example.demo.mapper.OccupyMapper;
import com.example.demo.pojo.Building;
import com.example.demo.pojo.Classroom;
import com.example.demo.pojo.Occupy;
import com.example.demo.service.ClassroomService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Service
public class ClassroomServiceImpl extends ServiceImpl<ClassroomMapper, Classroom> implements ClassroomService {
    @Resource
    ClassroomMapper classroomMapper;
    @Resource
    OccupyMapper occupyMapper;
    @Override
    public List<Classroom> getAllClassroomsByBuilding(Long buildingId) {
        List<Classroom> classrooms = list(Wrappers.<Classroom>lambdaQuery().eq(Classroom::getBuildingId, buildingId));
        if (classrooms.isEmpty()) {
            throw new DataNotFoundException("No classrooms in building " + buildingId + " found.");
        }
        return classrooms;
    }
    /*
    根据classroomId、date和time在Occupy中获取所有占用教室
     */
    @Override
    public List<Classroom> getAllOccupiedClassroomByTime(Long classroomId, String date, String time) {
        List<Occupy> occupies = occupyMapper.selectList(Wrappers.<Occupy>lambdaQuery().eq(Occupy::getClassroomId, classroomId).eq(Occupy::getDate, date).eq(Occupy::getOccupyTime, time));
        if (occupies.isEmpty()) {
            throw new DataNotFoundException("No occupied classrooms in classroom " + classroomId + " found.");
        }
        List<Classroom> classrooms = listByIds((Collection<? extends Serializable>) occupies);
        return classrooms;
    }



}
