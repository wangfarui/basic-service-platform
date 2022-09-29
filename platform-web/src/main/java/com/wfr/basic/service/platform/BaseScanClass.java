package com.wfr.basic.service.platform;

import com.wfr.code.generator.CodeGenerator;
import com.wfr.code.generator.config.DbConfig;
import com.wfr.code.generator.config.GlobalConfig;

/**
 * 基础扫描类
 *
 * @author wangfarui
 * @since 2022/7/8
 */
public final class BaseScanClass {

    public static void main(String[] args) {
        CodeGenerator.generate(
                DbConfig.toBuilder()
                        .setDatabase("basic_platform")
                        .setUsername("your")
                        .setPassword("your")
                        .setPort("3307")
                        .build(),
                GlobalConfig.toBuilder()
                        .setOutputDir("D:\\workspaces\\wfr\\basic-service-platform\\platform-web\\src\\main\\java\\com\\wfr\\basic\\service\\platform\\tmp")
                        .build()
        );
    }
}
