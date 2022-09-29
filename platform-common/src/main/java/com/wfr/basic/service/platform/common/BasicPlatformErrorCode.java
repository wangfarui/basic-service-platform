package com.wfr.basic.service.platform.common;

import com.wfr.base.framework.common.ApiCode;
import lombok.Getter;

/**
 * 基础平台错误编码
 *
 * @author wangfarui
 * @since 2022/9/6
 */
public enum BasicPlatformErrorCode implements ApiCode {

    COMMON_SELECT_ERROR(5001, "查询异常");

    BasicPlatformErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Getter
    private final int code;

    @Getter
    private final String message;

}
