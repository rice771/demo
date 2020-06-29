package com.rice.generator.zvan;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.rice.generator.config.BaseConfig;
import com.rice.generator.config.ClassConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 基础配置类
 * @Author: ln
 * @Date: 2019/9/24 11:46
 **/
public class MyGenerator extends BaseGenerator {

    /**
     * 自定义配置
     */
    public static InjectionConfig setInjectionConfig() {

        // 自定义输出配置，自定义配置会被优先输出
        String templatePath = BaseConfig.templatePath;
        String baseClassPath = BaseConfig.fileOutPath + ClassConfig.basePath;

        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig(templatePath + ClassConfig.entityName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.entityPath
                        + tableInfo.getEntityName() + ".java";
            }
        });
        focList.add(new FileOutConfig(templatePath + ClassConfig.dtoName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.dtoPath
                        + tableInfo.getEntityName() + ClassConfig.dtoName;
            }
        });
        focList.add(new FileOutConfig(templatePath + ClassConfig.paramName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.paramPath
                        + tableInfo.getEntityName() + ClassConfig.paramName;
            }
        });
        focList.add(new FileOutConfig(templatePath + ClassConfig.voName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.voPath
                        + tableInfo.getEntityName() + ClassConfig.voName;
            }
        });
        focList.add(new FileOutConfig(templatePath + ClassConfig.controllerName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.controllerPath
                        + tableInfo.getEntityName() + ClassConfig.controllerName;
            }
        });
        focList.add(new FileOutConfig(templatePath + ClassConfig.serviceName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.servicePath
                        + tableInfo.getEntityName() + ClassConfig.serviceName;
            }
        });
        focList.add(new FileOutConfig(templatePath + ClassConfig.serviceImplName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.serviceImplPath
                        + tableInfo.getEntityName() + ClassConfig.serviceImplName;
            }
        });
        focList.add(new FileOutConfig(templatePath + ClassConfig.mapperName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.mapperPath
                        + tableInfo.getMapperName() + ".java";
            }
        });
        focList.add(new FileOutConfig(templatePath + ClassConfig.mapperXmlName + ".vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return baseClassPath + ClassConfig.mapperXmlPath
                        + tableInfo.getEntityName() + ClassConfig.mapperXmlName;
            }
        });

        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {

            }
        };
        cfg.setFileOutConfigList(focList);
        return cfg;
    }

    public static void DoGenerator() {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        mpg.setGlobalConfig(setGlobalConfig());
        // 数据源配置
        mpg.setDataSource(setDataSourceConfig());
        // 包配置
        mpg.setPackageInfo(setPackageConfig());
        // 自定义配置（表配置、模板配置）
        mpg.setCfg(setInjectionConfig());
        // 配置模板
        mpg.setTemplate(setTemplateConfig());
        // 策略配置
        mpg.setStrategy(setStrategyConfig());
        // 模板引擎配置
        mpg.setTemplateEngine(new VelocityTemplateEngine());
        // 执行
        mpg.execute();
    }
}
