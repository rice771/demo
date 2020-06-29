package com.rice.generator.zvan;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.rice.generator.config.BaseConfig;
import com.rice.generator.config.ClassConfig;
import com.rice.generator.config.TableConfig;

/**
 * @Description: 基础配置类
 * @Author: ln
 * @Date: 2019/9/24 11:46
 **/
public abstract class BaseGenerator {

    /**
     * 全局配置
     */
    public static GlobalConfig setGlobalConfig(){
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(BaseConfig.fileOutPath);
        gc.setAuthor(BaseConfig.author);
        gc.setIdType(IdType.valueOf(TableConfig.idType));
        //开启xml文件输出基本内容
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        gc.setFileOverride(true);
        gc.setSwagger2(true);
        return gc;
    }
    /**
     * 数据源配置
     */
    public static DataSourceConfig setDataSourceConfig() {
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.getDbType(BaseConfig.dbType));
        dsc.setUrl(BaseConfig.url);
        dsc.setDriverName(BaseConfig.driverClassName);
        dsc.setUsername(BaseConfig.username);
        dsc.setPassword(BaseConfig.password);
        return dsc;
    }
    /**
     * 包配置
     */
    public static PackageConfig setPackageConfig() {
        PackageConfig pc = new PackageConfig();
        pc.setParent(BaseConfig.packagePath);
        pc.setModuleName(BaseConfig.modelName);
        return pc;
    }
    /**
     * 策略配置
     */
    public static StrategyConfig setStrategyConfig() {
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(ClassConfig.lombokModel);
        strategy.setRestControllerStyle(ClassConfig.restControllerStyle);
        // 公共父类
        if(!ClassConfig.baseClassDisable){
            strategy.setSuperControllerClass(ClassConfig.superController);
            strategy.setSuperEntityClass(ClassConfig.superEntity);
            strategy.setSuperServiceClass(ClassConfig.superService);
        }
        // 写于父类中的公共字段
        if (!ClassConfig.commonFiledDisable){
            strategy.setSuperEntityColumns(ClassConfig.id);
            strategy.setSuperEntityColumns(ClassConfig.createTime);
            strategy.setSuperEntityColumns(ClassConfig.createUser);
            strategy.setSuperEntityColumns(ClassConfig.updateTime);
            strategy.setSuperEntityColumns(ClassConfig.updateUser);
            strategy.setLogicDeleteFieldName(ClassConfig.delFlag);
        }
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(TableConfig.tablePrefix);
        // 包含的表
        if(StringUtils.isNotEmpty(TableConfig.tableName)){
            String[] tables = TableConfig.tableName.split(",");
            strategy.setInclude(tables);
        }
        if(StringUtils.isNotEmpty(TableConfig.noTable)){
            String[] noTables = TableConfig.noTable.split(",");
            strategy.setExclude(noTables);
        }
        return strategy;
    }

    public static TemplateConfig setTemplateConfig(){
        TemplateConfig templateConfig = new TemplateConfig();
        // 指定自定义模板，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        String templatePath = BaseConfig.templatePath;
        /*templateConfig.setEntity(templatePath + ClassConfig.entityName);
        templateConfig.setService(templatePath + ClassConfig.serviceName);
        templateConfig.setServiceImpl(templatePath + ClassConfig.serviceImplName);
        templateConfig.setController(templatePath + ClassConfig.controllerName);
        templateConfig.setMapper(templatePath + ClassConfig.entityName);
        templateConfig.setXml(templatePath + ClassConfig.mapperXmlName);*/
        templateConfig.setEntity(null);
        templateConfig.setService(null);
        templateConfig.setServiceImpl(null);
        templateConfig.setController(null);
        templateConfig.setMapper(null);
        templateConfig.setXml(null);
        return templateConfig;
    }




}
