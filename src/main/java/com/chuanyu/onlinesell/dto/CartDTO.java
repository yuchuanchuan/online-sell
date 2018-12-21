package com.chuanyu.onlinesell.dto;

import lombok.Data;

/**
 * 购物车
 * Created by yuchuanchuan
 * 2018年11月12日
 */
@Data
public class CartDTO {

    private String productId;               // 商品Id
    private Integer productQuantity;         // 商品数量

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
