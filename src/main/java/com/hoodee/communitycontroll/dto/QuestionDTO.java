package com.hoodee.communitycontroll.dto;

import com.hoodee.communitycontroll.model.Question;
import lombok.Data;

import java.util.List;

/**
 * Package: com.hoodee.communitycontroll.dto
 * Description：
 * Author: jianghao
 * Date:  2020.02.28 23:31
 * Modified By:
 */
@Data
public class QuestionDTO {
    private Integer page;
    private Integer limit;
    private Long total;
    private List<Question> questionList;
}
