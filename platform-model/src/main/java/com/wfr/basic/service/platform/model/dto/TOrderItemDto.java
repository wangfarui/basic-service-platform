package com.wfr.basic.service.platform.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 订单商品表
 * </p>
 *
 * @author wangfarui
 * @since 2023-03-08
 */
@Getter
@Setter
@ApiModel(value = "TOrderItem对象", description = "订单商品表")
public class TOrderItemDto {

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("企业id")
    private Long companyId;

    @ApiModelProperty("订单id")
    private Long orderId;

    @ApiModelProperty("商品名称")
    private String itemName;

    @ApiModelProperty("备注")
    private String remark;


}
