package com.wfr.basic.service.platform.controller;

import com.wfr.basic.service.platform.model.dto.TOrderDto;
import com.wfr.basic.service.platform.service.ITOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author wangfarui
 * @since 2023-03-08
 */
@RestController
@RequestMapping("/tOrder")
public class TOrderController {

    @Autowired
    private ITOrderService orderService;

    @PostMapping("/add")
    public void add(@RequestBody TOrderDto dto) {
        orderService.add(dto);
    }
}
