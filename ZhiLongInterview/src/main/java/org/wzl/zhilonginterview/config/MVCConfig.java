package org.wzl.zhilonginterview.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : 卫志龙
 * @date : 2023/5/15
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer {

    @Value("${file.path}")
    private String FILE_PATH;


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/f/**")
                .addResourceLocations("file:"+FILE_PATH);
    }

}
