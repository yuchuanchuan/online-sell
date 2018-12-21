package com.chuanyu.onlinesell.service;

import com.chuanyu.onlinesell.dto.OrderDTO;

public interface BuyerService {

    // 查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    // 取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
