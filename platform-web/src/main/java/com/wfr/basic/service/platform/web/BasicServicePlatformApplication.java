package com.wfr.basic.service.platform.web;

import com.wfr.basic.service.platform.BaseScanClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * basic-service-platform web启动类
 *
 * @author wangfarui
 * @since 2022/7/8
 */
@SpringBootApplication(scanBasePackageClasses = BaseScanClass.class)
public class BasicServicePlatformApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BasicServicePlatformApplication.class);
        System.out.println(applicationContext);
    }
}
