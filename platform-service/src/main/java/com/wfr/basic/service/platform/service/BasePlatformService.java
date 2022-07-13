package com.wfr.basic.service.platform.service;

import com.wfr.springboot.aliyun.service.sls.log.content.SlsLogData;
import com.wfr.springboot.base.log.context.LogData;
import com.wfr.springboot.base.log.context.Logger;
import org.springframework.stereotype.Service;

/**
 * 基础平台服务层
 *
 * @author wangfarui
 * @since 2022/7/8
 */
@Service("basePlatformService")
public class BasePlatformService {

    /**
     * 打印SLS日志
     *
     * @param msg 日志消息
     */
    public void printSlsLog(String msg) {
        System.out.println(msg);
        Logger.warn(LogData.class)
                .addMessage(msg)
                .add("user", "wang")
                .put();

        LogData.debug()
                .addMessage("测试")
                .put();

        LogData.info()
                .addMessage(msg)
                .add("user", "wangfarui")
                .put();

        SlsLogData.info("basePlatformService")
                .addMessage(msg)
                .add("user", "wfr")
                .put();
    }
}
