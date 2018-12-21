package com.chuanyu.onlinesell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品及商品类目
 * Create by yuchuanchuan
 * 2018年11月11日
 */
@Data
public class ProductVO {

    /**
     * @JsonProperty 是将属性categoryName重新命名为name的名称返回到前端
     */
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type ")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
