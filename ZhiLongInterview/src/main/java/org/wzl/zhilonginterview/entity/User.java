package org.wzl.zhilonginterview.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author : 卫志龙
 * @date : 2023/5/13
 */
@Data
@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String userOpenId;
    private String username;

}
