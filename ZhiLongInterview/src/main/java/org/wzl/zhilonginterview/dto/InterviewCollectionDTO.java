package org.wzl.zhilonginterview.dto;

import lombok.Data;

import java.sql.Date;

/**
 * @author : 卫志龙
 * @date : 2023/5/13
 */
@Data
public class InterviewCollectionDTO {
    private Integer id;
    private String name;
    private Date createTime;
    private String authorName;
    private String description;
    private Integer totalPages;
}
