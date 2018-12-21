package com.chuanyu.onlinesell.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单状态
 * Created By yuchuanchuan
 * 2018年11月12日
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
