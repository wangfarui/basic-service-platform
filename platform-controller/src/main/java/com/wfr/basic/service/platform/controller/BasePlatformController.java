package com.wfr.basic.service.platform.controller;

import com.wfr.basic.service.platform.service.BasePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基础平台控制层
 *
 * @author wangfarui
 * @since 2022/7/8
 */
@RestController("/base")
public class BasePlatformController {

    @Autowired
    private BasePlatformService basePlatformService;

    /**
     * 打印阿里云SLS日志
     */
    @GetMapping("/printSlsLog")
    public void printSlsLog(@RequestParam("msg") String msg) {
        basePlatformService.printSlsLog(msg);
    }
}
