package com.example.mybatis_plus_generator;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: chenmingjian
 * @Date: 18-10-25 18:14
 */

public class CodeGenerator {
    //作者
    private static final String author = "Jie7968";

    //数据库
    private static final String url = "jdbc:mysql://localhost:3306/zyoux?useUnicode=true&useSSL=false&characterEncoding=utf8";
    private static final String driverName = "com.mysql.jdbc.Driver";
    private static final String userName = "root";
    private static final String password = "root";
    private static final String table_name = "zyx_bank_card";

    //表对应的基类名
    private static final String entityName = "BankCard";

    //如StudentController,StudentService
    private static final String name_prex = "BankCard";

    //生成在该目录下
    private static final String package_name = "com.example.mybatis_plus_generator";


    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor(author);
        gc.setOpen(false);
        gc.setEntityName(entityName);
        gc.setMapperName(name_prex + "Mapper");
        gc.setControllerName(name_prex + "Controller");
        gc.setServiceName(name_prex + "Service");
        gc.setServiceImplName(name_prex + "ServiceImpl");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(url);
        // dsc.setSchemaName("public");
        dsc.setDriverName(driverName);
        dsc.setUsername(userName);
        dsc.setPassword(password);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setModuleName(scanner("模块名"));
        pc.setParent(package_name);
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        List<FileOutConfig> focList = new ArrayList<>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输入文件名称
                return projectPath + "/src/main/resources/mapper/" /*+ pc.getModuleName()*/
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        mpg.setTemplate(new TemplateConfig().setXml(null));

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
//        strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
        strategy.setInclude(table_name);
        strategy.setSuperEntityColumns("id");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

}