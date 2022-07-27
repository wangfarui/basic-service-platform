package com.wfr.basic.service.platform.model.dto.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * 删除平台用户
 *
 * @author wangfarui
 * @since 2022/7/26
 */
@Data
public class DeletePlatformUserDto {

    @NotEmpty
    private List<Long> ids;
}
