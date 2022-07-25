package com.wfr.basic.service.platform.model.vo.user;

import lombok.Data;

/**
 * 平台用户视图对象
 *
 * @author wangfarui
 * @since 2022/7/25
 */
@Data
public class PlatformUserVo {

    private Long id;

    private String name;

    private String accountName;

    private String comment;
}
