package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author macbookproz11
 */
@Data
@TableName("brainco_data")
public class BrainCoData {
//    private Integer id;
    private String name;
    private Integer value;
}
