package org.wzl.zhilonginterview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wzl.zhilonginterview.mapper.InterviewCollectionMapper;
import org.wzl.zhilonginterview.utils.Response;

/**
 * @author : 卫志龙
 * @date : 2023/5/13
 */
@RestController
@RequestMapping("/interview_collection")
public class InterviewCollection {

    @Autowired
    private InterviewCollectionMapper interviewCollectionMapper;

    @GetMapping("/list")
    public Response<Object> list() {
        return Response.ok()
                .setData(interviewCollectionMapper.selectList(null));
    }

    @GetMapping(value = "/list/{page}/{limit}", produces = "application/json")
    public Response<Object> listPage(@PathVariable Integer limit, @PathVariable Integer page) {
        return Response.ok()
                .setData(interviewCollectionMapper.page(limit,page));
    }


}
