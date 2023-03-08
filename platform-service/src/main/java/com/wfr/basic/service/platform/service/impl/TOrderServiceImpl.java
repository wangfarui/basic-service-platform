package com.wfr.basic.service.platform.service.impl;

import com.wfr.basic.service.platform.dao.service.ITOrderDaoService;
import com.wfr.basic.service.platform.model.dto.TOrderDto;
import com.wfr.basic.service.platform.model.entity.TOrderEntity;
import com.wfr.basic.service.platform.service.ITOrderService;
import com.wfr.springboot.base.bean.mapper.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单表 服务实现层
 *
 * @author Wray
 * @since 2023/3/8
 */
@Service
public class TOrderServiceImpl implements ITOrderService {

    @Autowired
    private ITOrderDaoService orderDaoService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(TOrderDto dto) {
        boolean b = orderDaoService.save(BeanMapper.copy(dto, TOrderEntity.class));
        System.out.println(b);
    }
}
