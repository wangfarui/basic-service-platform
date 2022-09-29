package com.wfr.basic.service.platform.model.dto.user;

import com.wfr.base.framework.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 列表查询平台用户
 *
 * @author wangfarui
 * @since 2022/7/26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ListPlatformUserDto extends PageRequest {

    /**
     * 名称
     */
    private String name;

    /**
     * 账户名
     */
    private String accountName;

    /**
     * 公司id
     */
    private Long companyId;
}
