package com.wfr.basic.service.platform.dao.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wfr.base.framework.common.PageResponse;
import com.wfr.base.framework.common.utils.PageUtils;
import com.wfr.basic.service.platform.dao.mapper.PlatformUserMapper;
import com.wfr.basic.service.platform.dao.service.IPlatformUserDaoService;
import com.wfr.basic.service.platform.model.dto.user.ListPlatformUserDto;
import com.wfr.basic.service.platform.model.entity.PlatformUserEntity;
import com.wfr.basic.service.platform.model.vo.user.PlatformUserVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 平台用户 数据访问层服务实现类
 *
 * @author wangfarui
 * @since 2022/7/25
 */
@Service
public class PlatformUserDaoServiceImpl extends ServiceImpl<PlatformUserMapper, PlatformUserEntity> implements IPlatformUserDaoService {

    @Override
    public List<PlatformUserVo> listPlatformUser(ListPlatformUserDto dto, Long companyId) {
        return baseMapper.listPlatformUser(dto, companyId);
    }

    @Override
    public PageResponse<PlatformUserVo> pagePlatformUser(ListPlatformUserDto dto) {
        IPage<PlatformUserVo> page = baseMapper.pagePlatformUser(PageUtils.toPage(dto), dto);

        return PageUtils.wrapPage(page);
    }
}
