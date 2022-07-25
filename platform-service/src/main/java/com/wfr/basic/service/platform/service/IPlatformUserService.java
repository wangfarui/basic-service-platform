package com.wfr.basic.service.platform.service;

import com.wfr.basic.service.platform.model.dto.user.EditPlatformUserDto;
import com.wfr.basic.service.platform.model.vo.user.PlatformUserVo;

/**
 * 平台用户 接口服务层
 *
 * @author wangfarui
 * @since 2022/7/25
 */
public interface IPlatformUserService {

    /**
     * 获取平台用户信息
     *
     * @param id 用户id
     * @return 平台用户基础信息（除密码）
     */
    PlatformUserVo getPlatformUserInfoById(Long id);

    /**
     * 注册平台用户
     *
     * @param dto 可编辑的平台用户信息
     */
    void registerPlatformUser(EditPlatformUserDto dto);

    /**
     * 修改平台用户信息
     *
     * @param dto 可编辑的平台用户信息
     */
    void editPlatformUser(EditPlatformUserDto dto);
}
