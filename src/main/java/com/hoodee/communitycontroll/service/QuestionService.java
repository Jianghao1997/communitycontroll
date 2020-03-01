package com.hoodee.communitycontroll.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hoodee.communitycontroll.dto.QuestionDTO;
import com.hoodee.communitycontroll.dto.R;
import com.hoodee.communitycontroll.mapper.QuestionMapper;
import com.hoodee.communitycontroll.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package: com.hoodee.communitycontroll.service
 * Description：
 * Author: jianghao
 * Date:  2020.02.29 1:10
 * Modified By:
 */
@Service
public class QuestionService {
    @Autowired
    QuestionMapper questionMapper;

    /**
     *查询所有问题
     * @param page
     * @param limit
     * @return
     */
    public QuestionDTO listAll(Integer page, Integer limit){
        QuestionDTO questionDTO = new QuestionDTO();
        IPage<Question> pages = new Page<>(page,limit);
        questionMapper.selectPage(pages, null);
        questionDTO.setPage(page);
        questionDTO.setLimit(limit);
        questionDTO.setTotal(pages.getTotal());
        questionDTO.setQuestionList(pages.getRecords());
        return questionDTO;
    }

    /**
     *根据id删除问题
     * @param id
     * @return
     */
    public R delet(Long id) {
        questionMapper.deleteById(id);
        return R.ok();
    }
}
