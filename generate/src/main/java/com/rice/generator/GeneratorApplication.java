package com.rice.generator;

import com.rice.generator.zvan.MyGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 启动类
 * @Author: ln
 * @Date: 2019/9/24 11:47
 **/

@SpringBootApplication
public class GeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratorApplication.class, args);
        System.out.println("代码生成开始。。。。。。。。");
        MyGenerator.DoGenerator();
        System.out.println("代码生成完成。。。。。。。。");
    }

}
