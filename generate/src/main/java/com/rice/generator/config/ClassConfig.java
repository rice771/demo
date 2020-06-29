package com.rice.generator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 类配置
 * @Author: ln
 * @Date: 2019/9/24 11:44
 **/
@Component
public class ClassConfig {

    public static boolean lombokModel;
    @Value("${class.config.lombokModel}")
    public void setLombokModel(boolean lombokModel) {
        ClassConfig.lombokModel = lombokModel;
    }

    public static boolean restControllerStyle;
    @Value("${class.config.restControllerStyle}")
    public void setRestControllerStyle(boolean restControllerStyle) {
        ClassConfig.restControllerStyle = restControllerStyle;
    }

    /********************** 类路径 *********************/

    public static String basePath;
    @Value("${class.path.basePath}")
    public void setBasePath(String basePath) {
        ClassConfig.basePath = basePath;
    }

    public static String entityPath;
    @Value("${class.path.entityPath}")
    public void setEntityPath(String entityPath) {
        ClassConfig.entityPath = entityPath;
    }

    public static String dtoPath;
    @Value("${class.path.dtoPath}")
    public void setDtoPath(String dtoPath) {
        ClassConfig.dtoPath = dtoPath;
    }

    public static String voPath;
    @Value("${class.path.voPath}")
    public void setVoPath(String voPath) {
        ClassConfig.voPath = voPath;
    }

    public static String pageVoPath;
    @Value("${class.path.pageVoPath}")
    public void setPageVoPath(String pageVoPath) {
        ClassConfig.pageVoPath = pageVoPath;
    }

    public static String paramPath;
    @Value("${class.path.paramPath}")
    public void setParamPath(String paramPath) {
        ClassConfig.paramPath = paramPath;
    }

    public static String apiPath;
    @Value("${class.path.apiPath}")
    public void setApiPath(String apiPath) {
        ClassConfig.apiPath = apiPath;
    }

    public static String controllerPath;
    @Value("${class.path.controllerPath}")
    public void setControllerPath(String controllerPath) {
        ClassConfig.controllerPath = controllerPath;
    }

    public static String servicePath;
    @Value("${class.path.servicePath}")
    public void setServicePath(String servicePath) {
        ClassConfig.servicePath = servicePath;
    }

    public static String serviceImplPath;
    @Value("${class.path.serviceImplPath}")
    public void setServiceImplPath(String serviceImplPath) {
        ClassConfig.serviceImplPath = serviceImplPath;
    }

    public static String daoPath;
    @Value("${class.path.daoPath}")
    public void setDaoPath(String daoPath) {
        ClassConfig.daoPath = daoPath;
    }

    public static String mapperPath;
    @Value("${class.path.mapperPath}")
    public void setMapperPath(String mapperPath) {
        ClassConfig.mapperPath = mapperPath;
    }

    public static String mapperXmlPath;
    @Value("${class.path.mapperXmlPath}")
    public void setMapperXmlPath(String mapperXmlPath) {
        ClassConfig.mapperXmlPath = mapperXmlPath;
    }

    /********************** 基类配置 *********************/

    public static Boolean baseClassDisable;
    @Value("${class.baseClass.disable}")
    public void setBaseClassDisable(Boolean baseClassDisable) {
        ClassConfig.baseClassDisable = baseClassDisable;
    }

    public static String superEntity;
    @Value("${class.baseClass.superEntity}")
    public void setSuperEntity(String superEntity) {
        ClassConfig.superEntity = superEntity;
    }

    public static String superController;
    @Value("${class.baseClass.superController}")
    public void setSuperController(String superController) {
        ClassConfig.superController = superController;
    }

    public static String superService;
    @Value("${class.baseClass.superService}")
    public void setSuperService(String superService) {
        ClassConfig.superService = superService;
    }

    /********************** 实体基类公共属性 *********************/

    public static Boolean commonFiledDisable;
    @Value("${class.commonField.disable}")
    public void setCommonFiledDisable(Boolean commonFiledDisable) {
        ClassConfig.commonFiledDisable = commonFiledDisable;
    }

    public static String id;
    @Value("${class.commonField.id}")
    public void setId(String id) {
        ClassConfig.id = id;
    }

    public static String createTime;
    @Value("${class.commonField.createTime}")
    public void setCreateTime(String createTime) {
        ClassConfig.createTime = createTime;
    }

    public static String createUser;
    @Value("${class.commonField.createUser}")
    public void setCreateUser(String createUser) {
        ClassConfig.createUser = createUser;
    }

    public static String updateTime;
    @Value("${class.commonField.updateTime}")
    public void setUpdateTime(String updateTime) {
        ClassConfig.updateTime = updateTime;
    }

    public static String updateUser;
    @Value("${class.commonField.updateUser}")
    public void setUpdateUser(String updateUser) {
        ClassConfig.updateUser = updateUser;
    }

    public static String delFlag;
    @Value("${class.commonField.delFlag}")
    public void setDelFlag(String delFlag) {
        ClassConfig.delFlag = delFlag;
    }

    /********************** 类名后缀 *********************/

    public static String entityName;
    @Value("${class.suffix.entityName}")
    public void setEntityName(String entityName) {
        ClassConfig.entityName = entityName;
    }

    public static String dtoName;
    @Value("${class.suffix.dtoName}")
    public void setDtoName(String dtoName) {
        ClassConfig.dtoName = dtoName;
    }

    public static String voName;
    @Value("${class.suffix.voName}")
    public void setVoName(String voName) {
        ClassConfig.voName = voName;
    }

    public static String pageVoName;
    @Value("${class.suffix.pageVoName}")
    public void setPageVoName(String pageVoName) {
        ClassConfig.pageVoName = pageVoName;
    }

    public static String paramName;
    @Value("${class.suffix.paramName}")
    public void setParamName(String paramName) {
        ClassConfig.paramName = paramName;
    }

    public static String apiName;
    @Value("${class.suffix.apiName}")
    public void setApiName(String apiName) {
        ClassConfig.apiName = apiName;
    }

    public static String controllerName;
    @Value("${class.suffix.controllerName}")
    public void setControllerName(String controllerName) {
        ClassConfig.controllerName = controllerName;
    }

    public static String serviceName;
    @Value("${class.suffix.serviceName}")
    public void setServiceName(String serviceName) {
        ClassConfig.serviceName = serviceName;
    }

    public static String serviceImplName;
    @Value("${class.suffix.serviceImplName}")
    public void setServiceImplName(String serviceImplName) {
        ClassConfig.serviceImplName = serviceImplName;
    }

    public static String daoName;
    @Value("${class.suffix.daoName}")
    public void setDaoName(String daoName) {
        ClassConfig.daoName = daoName;
    }

    public static String mapperName;
    @Value("${class.suffix.mapperName}")
    public void setMapperName(String mapperName) {
        ClassConfig.mapperName = mapperName;
    }

    public static String mapperXmlName;
    @Value("${class.suffix.mapperXmlName}")
    public void setMapperXmlName(String mapperXmlName) {
        ClassConfig.mapperXmlName = mapperXmlName;
    }








}
