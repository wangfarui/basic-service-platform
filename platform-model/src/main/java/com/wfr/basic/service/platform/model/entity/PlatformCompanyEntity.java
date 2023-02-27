package com.wfr.basic.service.platform.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * 平台企业 实体类
 *
 * @author wangfarui
 * @since 2023/2/27
 */
@TableName("platform_company")
@Getter
@Setter
public class PlatformCompanyEntity extends BaseEntity {

    /**
     * 企业名称
     */
    private String companyName;
}
