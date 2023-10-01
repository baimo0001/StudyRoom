package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@TableName("occupy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Occupy {
    @TableId
    private Long id;
    @TableLogic
    private Boolean deleted;
    private Long classroomId;
    private Boolean[][] occupy = new Boolean[7][12];
}