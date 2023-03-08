package com.wfr.basic.service.platform.dao.service.impl;

import com.wfr.basic.service.platform.model.entity.TOrderItemEntity;
import com.wfr.basic.service.platform.dao.mapper.TOrderItemMapper;
import com.wfr.basic.service.platform.dao.service.ITOrderItemDaoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单商品表 服务实现类
 * </p>
 *
 * @author wangfarui
 * @since 2023-03-08
 */
@Service
public class TOrderItemDaoServiceImpl extends ServiceImpl<TOrderItemMapper, TOrderItemEntity> implements ITOrderItemDaoService {

}
