package com.wfr.basic.service.platform.dao.service.impl;

import com.wfr.basic.service.platform.model.entity.TOrderEntity;
import com.wfr.basic.service.platform.dao.mapper.TOrderMapper;
import com.wfr.basic.service.platform.dao.service.ITOrderDaoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wangfarui
 * @since 2023-03-08
 */
@Service
public class TOrderDaoServiceImpl extends ServiceImpl<TOrderMapper, TOrderEntity> implements ITOrderDaoService {

}
