package org.wzl.zhilonginterview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wzl.zhilonginterview.mapper.QuestionMapper;
import org.wzl.zhilonginterview.utils.Response;

/**
 * @author : 卫志龙
 * &#064;date  : 2023/5/20
 */
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionMapper questionMapper;

    @GetMapping("/getByCId")
    public Response<Object> getByCId(Integer cId) {
        return Response.ok().setData(questionMapper.getByCIdQuestions(cId));
    }

}
