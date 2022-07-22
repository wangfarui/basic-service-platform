package com.wfr.basic.service.platform.controller;

import com.wfr.basic.service.platform.model.vo.base.Test1Vo;
import com.wfr.basic.service.platform.service.BasePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 基础平台控制层
 *
 * @author wangfarui
 * @since 2022/7/8
 */
@RestController
@RequestMapping("/base")
public class BasePlatformController {

    @Autowired
    private BasePlatformService basePlatformService;

    /**
     * 打印阿里云SLS日志
     */
    @GetMapping("/printSlsLog")
    public String printSlsLog(@RequestParam("msg") String msg) {
        return basePlatformService.printSlsLog(msg);
    }

    @PostMapping("/test")
    public Test1Vo test() {
        return Test1Vo.createTest1Vo(1L);
    }

    @PostMapping("/test/2")
    public Test1Vo test2() {
        return Test1Vo.createTest1Vo(2L);
    }

    @GetMapping("/abc")
    public Test1Vo abc1() {
        return Test1Vo.createTest1Vo(11L);
    }

    @GetMapping("/abc2")
    public Test1Vo abc2() {
        return Test1Vo.createTest1Vo(12L);
    }
}
