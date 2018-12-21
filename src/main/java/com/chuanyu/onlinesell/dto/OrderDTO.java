package com.chuanyu.onlinesell.dto;

import com.chuanyu.onlinesell.dataobject.OrderDetail;
import com.chuanyu.onlinesell.enums.OrderStatusEnum;
import com.chuanyu.onlinesell.enums.PayStatusEnum;
import com.chuanyu.onlinesell.utils.serializer.Date2LongSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @JsonInclude(JsonInclude.Include.NON_NULL)该注解是将当一个属性为null时， 则不返回到前端进行显示，由于每个实体都需要加这个注解，可以在配置文件application.yml
 * 进行配置，等价于jackson:
 * default-property-inclusion: non_null
 */

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private String orderId;                                         // 订单Id
    private String buyerName;                                       // 买家名字
    private String buyerPhone;                                      // 买家电话
    private String buyerAddress;                                    // 买家地址
    private String buyerOpenid;                                     // 买家微信openid
    private BigDecimal orderAmount;                                 // 订单总金额
    private Integer orderStatus;                                    // 订单状态，默认为0新下单
    private Integer payStatus;                                      // 支付状态，默认为0未支付
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;                                        // 创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;                                        // 更新时间

    private List<OrderDetail> orderDetailList;
}
