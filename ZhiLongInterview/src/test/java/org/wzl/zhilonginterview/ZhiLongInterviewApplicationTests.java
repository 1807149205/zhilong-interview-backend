package org.wzl.zhilonginterview;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.wzl.zhilonginterview.mapper.InterviewCollectionMapper;
import org.wzl.zhilonginterview.mapper.QuestionMapper;
import org.wzl.zhilonginterview.mapper.UserMapper;

import static org.wzl.zhilonginterview.constant.LogConstant.LOG_INFO_PREFIX;
import static org.wzl.zhilonginterview.constant.LogConstant.LOG_INFO_SUFFIX;

@SpringBootTest
@Slf4j
class ZhiLongInterviewApplicationTests {

    @Autowired
    private InterviewCollectionMapper interviewCollectionMapper;

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void MySQLTest_SELECT() {
        log.info("{}执行MySQL全局查找操作{}",LOG_INFO_PREFIX,LOG_INFO_SUFFIX);
        interviewCollectionMapper.selectList(null).forEach(System.out::println);
        questionMapper.selectList(null).forEach(System.out::println);
        userMapper.selectList(null).forEach(System.out::println);

        interviewCollectionMapper.page(0,2).forEach(System.out::println);
    }

    @Test
    void RedisTest_Insert() {
        log.info("{}执行Redis get set操作{}",LOG_INFO_PREFIX,LOG_INFO_SUFFIX);
        stringRedisTemplate.opsForValue().set("k1","v1");
        System.out.println(stringRedisTemplate.opsForValue().get("k1"));
    }

    @Test
    void test1() {
        questionMapper.getByCIdQuestions(1).forEach(System.out::println);
    }

}
