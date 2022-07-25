package com.wfr.basic.service.platform.model.dto.user;

import lombok.Data;

/**
 * 编辑平台用户信息
 *
 * @author wangfarui
 * @since 2022/7/25
 */
@Data
public class EditPlatformUserDto {

    private Long id;

    private String name;

    private String accountName;

    private String accountPassword;

    private String comment;
}
