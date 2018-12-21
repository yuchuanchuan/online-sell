package com.chuanyu.onlinesell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;                    // 订单详情Id
    private String orderId;                     // 订单Id
    private String productId;                   // 商品id
    private String productName;                 // 商品名称
    private BigDecimal productPrice;            // 当前价格,单位分
    private Integer productQuantity;            // 数量
    private String productIcon;                 // 商品小图
}
