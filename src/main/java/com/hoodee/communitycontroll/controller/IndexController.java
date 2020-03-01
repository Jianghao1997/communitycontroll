package com.hoodee.communitycontroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Package: com.hoodee.communitycontroll.controller
 * Description：
 * Author: jianghao
 * Date:  2020.02.29 9:02
 * Modified By:
 */
@Controller
public class IndexController {
    /**
     *
     * @return
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/question")
    public String questionList(){
        return "question";
    }

}
