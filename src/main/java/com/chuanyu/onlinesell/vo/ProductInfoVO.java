package com.chuanyu.onlinesell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品详情
 * Created by yuchuanchuan
 * 2018年11月11日
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("description")
    private String productDescription;
    @JsonProperty("icon")
    private String productIcon;
}
