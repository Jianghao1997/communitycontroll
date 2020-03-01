package com.hoodee.communitycontroll.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hoodee.communitycontroll.model.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Package: com.hoodee.communitycontroll.mapper
 * Description：
 * Author: jianghao
 * Date:  2020.02.28 20:41
 * Modified By:
 */
@Mapper
@TableName(value = "question")
@Component
public interface QuestionMapper extends BaseMapper<Question> {
}
