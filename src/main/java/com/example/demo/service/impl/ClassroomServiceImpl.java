package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.ClassroomMapper;
import com.example.demo.pojo.Classroom;
import com.example.demo.service.ClassroomService;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

@Service
public class ClassroomServiceImpl extends ServiceImpl<ClassroomMapper, Classroom> implements ClassroomService {
    @Override
    public List<Classroom> getAllClassroomsByBuilding(Long buildingId) {
        List<Classroom> classrooms = list(Wrappers.<Classroom>lambdaQuery().eq(Classroom::getBuildingId, buildingId));
        if (classrooms.isEmpty()) {
//            throw
        }
        return classrooms;
    }
}
