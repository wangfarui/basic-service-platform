package com.wfr.basic.service.platform.service;

import com.wfr.springboot.aliyun.service.sls.log.SlsLogData;
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
    public String printSlsLog(String msg) {
        System.out.println(msg);
        Logger.warn(LogData.class)
                .addMessage(msg)
                .add("user", "wang")
                .push();

        LogData.debug()
                .addMessage("测试")
                .push();

        LogData.info()
                .addMessage(msg)
                .add("user", "wangfarui")
                .push();

        SlsLogData.info("basePlatformService")
                .addMessage(msg)
                .add("user", "wfr")
                .push();

        return "success: " + msg;
    }
}
