package com.hoodee.communitycontroll.config;

/**
 * Package: com.hoodee.communitycontroll.config
 * Description：分页配置类
 * Author: jianghao
 * Date:  2020.02.28 23:30
 * Modified By:
 */

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
 @ConditionalOnClass(value = {PaginationInterceptor.class})
 public class MybatisPlusConfig {
      @Bean
      public PaginationInterceptor paginationInterceptor() {
                PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
                return paginationInterceptor;
           }
}
