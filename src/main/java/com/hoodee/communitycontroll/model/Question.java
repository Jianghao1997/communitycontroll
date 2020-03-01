package com.hoodee.communitycontroll.model;

import lombok.Data;

/**
 * Package: com.hoodee.communitycontroll.model
 * Description：
 * Author: jianghao
 * Date:  2020.02.28 20:31
 * Modified By:
 */
@Data
public class Question {

    private Long id;
    private String title;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private String description;
}
