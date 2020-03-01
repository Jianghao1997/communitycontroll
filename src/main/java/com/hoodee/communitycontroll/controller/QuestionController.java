package com.hoodee.communitycontroll.controller;
import com.hoodee.communitycontroll.dto.QuestionDTO;
import com.hoodee.communitycontroll.dto.R;
import com.hoodee.communitycontroll.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Package: com.hoodee.communitycontroll.controller
 * Description：
 * Author: jianghao
 * Date:  2020.02.28 21:12
 * Modified By:
 */
@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    /**
     *
     * @param page,limit
     * @return
     */
    @GetMapping("list")
    public QuestionDTO questionList(Integer page, Integer limit){
        return questionService.listAll(page,limit);
    }

    /**
     *
     * @param id
     * @return
     */
    @PostMapping(value = "remove/{id}")
    public R remove(@PathVariable Long id) {
        return questionService.delet(id);
    }
}
