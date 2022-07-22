package com.wfr.basic.service.platform.model.vo.base;

import lombok.Data;

/**
 * description
 *
 * @author wangfarui
 * @since 2022/7/20
 */
@Data
public class Test1Vo {

    private Long id;

    private String name;

    public static Test1Vo createTest1Vo(Long id) {
        Test1Vo vo = new Test1Vo();
        vo.setId(id);
        return vo;
    }
}
