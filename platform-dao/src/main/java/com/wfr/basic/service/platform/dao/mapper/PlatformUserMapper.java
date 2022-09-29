package com.wfr.basic.service.platform.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wfr.basic.service.platform.model.dto.user.ListPlatformUserDto;
import com.wfr.basic.service.platform.model.entity.PlatformUserEntity;
import com.wfr.basic.service.platform.model.vo.user.PlatformUserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 平台用户 数据访问层Mapper层
 *
 * @author wangfarui
 * @since 2022/7/25
 */
public interface PlatformUserMapper extends BaseMapper<PlatformUserEntity> {

    List<PlatformUserVo> listPlatformUser(@Param("dto") ListPlatformUserDto dto, @Param("companyId") Long companyId);

    IPage<PlatformUserVo> pagePlatformUser(@Param("page") IPage<PlatformUserVo> page, @Param("dto") ListPlatformUserDto dto);
}
