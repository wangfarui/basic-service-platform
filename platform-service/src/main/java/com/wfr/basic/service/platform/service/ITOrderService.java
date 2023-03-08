package com.wfr.basic.service.platform.service;

import com.wfr.basic.service.platform.model.dto.TOrderDto;

/**
 * 订单表 接口服务
 *
 * @author Wray
 * @since 2023/3/8
 */
public interface ITOrderService {

    void add(TOrderDto dto);
}
