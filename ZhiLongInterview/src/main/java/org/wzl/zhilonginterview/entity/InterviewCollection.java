package org.wzl.zhilonginterview.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * @author : 卫志龙
 * @date : 2023/5/13
 */
@Data
@TableName("interview_collection")
public class InterviewCollection {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Date createTime;
    private Integer authorId;
    private String description;

}
