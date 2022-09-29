package com.wfr.basic.service.platform.controller.user;

import com.wfr.base.framework.common.PageResponse;
import com.wfr.basic.service.platform.model.dto.user.DeletePlatformUserDto;
import com.wfr.basic.service.platform.model.dto.user.EditPlatformUserDto;
import com.wfr.basic.service.platform.model.dto.user.ListPlatformUserDto;
import com.wfr.basic.service.platform.model.vo.user.PlatformUserVo;
import com.wfr.basic.service.platform.service.IPlatformUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 平台用户 api控制层
 *
 * @author wangfarui
 * @since 2022/7/25
 */
@RestController
@RequestMapping("/platform/user")
@Validated
public class PlatformUserController {

    @Autowired
    private IPlatformUserService platformUserService;

    /**
     * 获取平台用户信息，通过用户id
     *
     * @return 平台用户基础信息
     */
    @GetMapping("/details")
    public PlatformUserVo getPlatformUserInfoById(@RequestParam(name = "id", required = false) Long id) {
        return platformUserService.getPlatformUserInfoById(id);
    }

    /**
     * 注册平台用户
     *
     * @param dto 可编辑的平台用户信息
     */
    @PostMapping("/register")
    public void registerPlatformUser(@Valid @RequestBody EditPlatformUserDto dto) {
        platformUserService.registerPlatformUser(dto);
    }

    /**
     * 修改平台用户信息
     *
     * @param dto 可编辑的平台用户信息
     */
    @PutMapping("/edit")
    public void editPlatformUser(@Valid @RequestBody EditPlatformUserDto dto) {
        platformUserService.editPlatformUser(dto);
    }

    /**
     * 删除平台用户 (批量)
     *
     * @param dto 待删除的平台用户信息
     */
    @DeleteMapping("/delete")
    public void deletePlatformUser(@Valid @RequestBody DeletePlatformUserDto dto) {
        platformUserService.deletePlatformUser(dto);
    }

    /**
     * 列表查询平台用户
     *
     * @param dto 列表查询的条件对象
     * @return 列表数据
     */
    @PostMapping("/list")
    public List<PlatformUserVo> listPlatformUser(@RequestBody ListPlatformUserDto dto) {
        return platformUserService.listPlatformUser(dto);
    }

    /**
     * 分页查询平台用户
     *
     * @param dto 分页查询的条件对象
     * @return 分页数据
     */
    @PostMapping("/page")
    public PageResponse<PlatformUserVo> pagePlatformUser(@RequestBody ListPlatformUserDto dto) {
        return platformUserService.pagePlatformUser(dto);
    }
}
