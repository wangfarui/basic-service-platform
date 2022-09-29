package com.wfr.basic.service.platform.dao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wfr.base.framework.common.PageResponse;
import com.wfr.basic.service.platform.model.dto.user.ListPlatformUserDto;
import com.wfr.basic.service.platform.model.entity.PlatformUserEntity;
import com.wfr.basic.service.platform.model.vo.user.PlatformUserVo;

import java.util.List;

/**
 * 平台用户 数据访问层服务接口类
 *
 * @author wangfarui
 * @since 2022/7/25
 */
public interface IPlatformUserDaoService extends IService<PlatformUserEntity> {

    List<PlatformUserVo> listPlatformUser(ListPlatformUserDto dto, Long companyId);

    PageResponse<PlatformUserVo> pagePlatformUser(ListPlatformUserDto dto);
}
