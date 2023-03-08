package com.wfr.basic.service.platform.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author wangfarui
 * @since 2023-03-08
 */
@Getter
@Setter
@TableName("t_order")
@ApiModel(value = "TOrder对象", description = "订单表")
public class TOrderEntity {

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("企业id")
    private Long companyId;

    @ApiModelProperty("订单号")
    private String orderSn;

    @ApiModelProperty("备注")
    private String remark;


}
