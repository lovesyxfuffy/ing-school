package com.ing.school.utls;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class Config {
    public static String config;
    @PostConstruct
    public void config() {
        String filePath = "config/config.json";//类路径，编译后classes目录下
        Resource resource = new ClassPathResource(filePath);
        try {
            config = FileCopyUtils.copyToString(new InputStreamReader(new FileInputStream(resource.getFile()),"utf8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
