package com.example.demo.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("classroom")
public class Classroom {
    @TableId
    private Integer ClassroomId;
    private String ClassroomName;

    private Building building;

    public Integer getClassroomId() { return ClassroomId; }

    public void setClassroomId(Integer classroomId) { this.ClassroomId = classroomId; }

    public String getClassroomName() { return ClassroomName; }

    public void setClassroomName(String classroomName) { this.ClassroomName = classroomName; }

    public Building getBuilding() { return building; }

    public void setBuilding(Building building) { this.building = building; }
}
