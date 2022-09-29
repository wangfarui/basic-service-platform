package com.wfr.basic.service.platform.service;

import com.wfr.base.framework.common.PageResponse;
import com.wfr.basic.service.platform.model.dto.user.DeletePlatformUserDto;
import com.wfr.basic.service.platform.model.dto.user.EditPlatformUserDto;
import com.wfr.basic.service.platform.model.dto.user.ListPlatformUserDto;
import com.wfr.basic.service.platform.model.vo.user.PlatformUserVo;

import java.util.List;

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

    /**
     * 删除平台用户 (批量)
     *
     * @param dto 待删除的平台用户信息
     */
    void deletePlatformUser(DeletePlatformUserDto dto);

    /**
     * 列表查询平台用户
     *
     * @param dto 列表查询的条件对象
     * @return 列表数据
     */
    List<PlatformUserVo> listPlatformUser(ListPlatformUserDto dto);

    /**
     * 分页查询平台用户
     *
     * @param dto 分页查询的条件对象
     * @return 分页数据
     */
    PageResponse<PlatformUserVo> pagePlatformUser(ListPlatformUserDto dto);
}
