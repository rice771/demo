package com.rice.generator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 基础配置类（注意set方法上不要不小心加上了static）
 * @Author: ln
 * @Date: 2019/9/24 11:44
 **/
@Component
public class BaseConfig {

    /** 文件输出路径 **/
    public static String fileOutPath;
    @Value("${base.fileOutPath}")
    public void setFileOutPath(String fileOutPath) {
        BaseConfig.fileOutPath = fileOutPath;
    }

    public static String author;
    @Value("${base.author}")
    public void setAuthor(String author) {
        BaseConfig.author = author;
    }

    public static String packagePath;
    @Value("${base.packagePath}")
    public void setPackagePath(String packagePath) {
        BaseConfig.packagePath = packagePath;
    }

    public static String modelName;
    @Value("${base.modelName}")
    public void setModelName(String modelName) {
        BaseConfig.modelName = modelName;
    }

    public static String templatePath;
    @Value("${base.templatePath}")
    public void setTemplatePath(String templatePath) {
        BaseConfig.templatePath = templatePath;
    }

    public static String driverClassName;
    @Value("${datasource.driverClassName}")
    public void setDriverClassName(String driverClassName) {
        BaseConfig.driverClassName = driverClassName;
    }

    public static String url;
    @Value("${datasource.url}")
    public void setUrl(String url) {
        BaseConfig.url = url;
    }

    public static String username;
    @Value("${datasource.username}")
    public void setUsername(String username) {
        BaseConfig.username = username;
    }

    public static String password;
    @Value("${datasource.password}")
    public void setPassword(String password) {
        BaseConfig.password = password;
    }

    public static String dbType;
    @Value("${datasource.dbType}")
    public void setDbType(String dbType) {
        BaseConfig.dbType = dbType;
    }


}
