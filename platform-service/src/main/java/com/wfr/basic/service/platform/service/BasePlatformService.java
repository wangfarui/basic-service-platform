package com.wfr.basic.service.platform.service;

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
    }
}
