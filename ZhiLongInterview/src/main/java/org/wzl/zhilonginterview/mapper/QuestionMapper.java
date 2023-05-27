package org.wzl.zhilonginterview.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.wzl.zhilonginterview.entity.Question;

import java.util.List;

/**
 * @author : 卫志龙
 * @date : 2023/5/13
 */
@Mapper
public interface QuestionMapper extends BaseMapper<Question> {


    void insertOne(Question question);

    List<Question> getByCIdQuestions(@Param("cId") Integer cId);

}
