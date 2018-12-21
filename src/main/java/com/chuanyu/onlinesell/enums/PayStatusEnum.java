package com.chuanyu.onlinesell.enums;

import lombok.Getter;

/**
 * 支付状态
 * Create By yuchuanchuan
 * 2018年11月12日
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
