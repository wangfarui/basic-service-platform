package com.wfr.basic.service.platform.dao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wfr.basic.service.platform.dao.mapper.PlatformUserMapper;
import com.wfr.basic.service.platform.dao.service.IPlatformUserDaoService;
import com.wfr.basic.service.platform.model.entity.PlatformUserEntity;
import org.springframework.stereotype.Service;

/**
 * 平台用户 数据访问层服务实现类
 *
 * @author wangfarui
 * @since 2022/7/25
 */
@Service
public class PlatformUserDaoServiceImpl extends ServiceImpl<PlatformUserMapper, PlatformUserEntity> implements IPlatformUserDaoService {
}
