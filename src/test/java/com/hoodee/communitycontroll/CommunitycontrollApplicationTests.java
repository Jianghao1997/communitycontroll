package com.hoodee.communitycontroll;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hoodee.communitycontroll.mapper.QuestionMapper;
import com.hoodee.communitycontroll.model.Question;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunitycontrollApplicationTests {
    @Autowired
    QuestionMapper questionMapper;
    @Test
    public void select() {
        List<Question> questions = questionMapper.selectList(null);
        questions.forEach(System.out::println);
    }

    @Test
    public void selectByTag(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("tag","mysql");
        List list = questionMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
}
