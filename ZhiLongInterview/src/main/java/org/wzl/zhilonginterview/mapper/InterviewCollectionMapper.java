package org.wzl.zhilonginterview.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.wzl.zhilonginterview.dto.InterviewCollectionDTO;
import org.wzl.zhilonginterview.entity.InterviewCollection;

import java.util.List;

/**
 * @author : 卫志龙
 * @date : 2023/5/13
 */
@Mapper
public interface InterviewCollectionMapper extends BaseMapper<InterviewCollection> {
    List<InterviewCollectionDTO> page(@Param("limit") Integer limit, @Param("page") Integer page);
}
