package com.example.demo.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("classroom")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classroom {
    @TableId
    private Long id;
    @TableLogic
    private Boolean deleted;
    private String classroomName;
    private Long buildingId;
    private Long occupyId;
}
