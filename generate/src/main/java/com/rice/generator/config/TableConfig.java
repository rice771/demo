package com.rice.generator.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: 表配置
 * @Author: lina
 * @Date: 2020/4/10 11:31
 */
@Component
public class TableConfig {

    public static String tableName;
    @Value("${table.tableName}")
    public void setTableName(String tableName) {
        TableConfig.tableName = tableName;
    }

    public static String noTable;
    @Value("${table.noTable}")
    public void setNoTable(String noTable) {
        TableConfig.noTable = noTable;
    }

    public static String idType;
    @Value("${table.idType}")
    public void setIdType(String idType) {
        TableConfig.idType = idType;
    }

    public static String tablePrefix;
    @Value("${table.tablePrefix}")
    public void setTablePrefix(String tablePrefix) {
        TableConfig.tablePrefix = tablePrefix;
    }

    public static String logicDeleteField;
    @Value("${table.logicDeleteField}")
    public void setLogicDeleteField(String logicDeleteField) {
        TableConfig.logicDeleteField = logicDeleteField;
    }

}
