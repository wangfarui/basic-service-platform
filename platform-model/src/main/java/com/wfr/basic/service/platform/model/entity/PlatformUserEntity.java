package com.wfr.basic.service.platform.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * 平台用户 实体类
 *
 * @author wangfarui
 * @since 2022/7/25
 */
@TableName("platform_user")
@Getter
@Setter
public class PlatformUserEntity extends BaseEntity {

    private String name;

    private String accountName;

    private String accountPassword;

    private String comment;
}
