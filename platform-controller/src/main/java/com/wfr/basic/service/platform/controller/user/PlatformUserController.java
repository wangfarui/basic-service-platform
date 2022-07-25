package com.wfr.basic.service.platform.controller.user;

import com.wfr.basic.service.platform.model.dto.user.EditPlatformUserDto;
import com.wfr.basic.service.platform.model.vo.user.PlatformUserVo;
import com.wfr.basic.service.platform.service.IPlatformUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    public PlatformUserVo getPlatformUserInfoById(@Valid @RequestParam(name = "id") Long id) {
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
}
