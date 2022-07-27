package com.wfr.basic.service.platform.model.dto.user;

import lombok.Data;

/**
 * 列表查询平台用户
 *
 * @author wangfarui
 * @since 2022/7/26
 */
@Data
public class ListPlatformUserDto {

    /**
     * 名称
     */
    private String name;

    /**
     * 账户名
     */
    private String accountName;

}
