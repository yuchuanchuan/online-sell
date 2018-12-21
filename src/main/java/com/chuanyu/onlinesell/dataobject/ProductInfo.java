package com.chuanyu.onlinesell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    @Id
    private String productId;            //  商品编号
    private String productName;          //  商品名称
    private BigDecimal productPrice;     //  单价
    private Integer productStock;        //  库存
    private String productDescription;   //  商品描述
    private String productIcon;          //  商品图标
    private Integer productStatus;       //  商品状态  0正常，1下架
    private Integer categoryType;        //  类目编号
}
