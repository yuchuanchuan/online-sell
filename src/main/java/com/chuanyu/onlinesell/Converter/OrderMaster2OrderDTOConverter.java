package com.chuanyu.onlinesell.Converter;

import com.chuanyu.onlinesell.dataobject.OrderMaster;
import com.chuanyu.onlinesell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream()
                .map(e -> convert(e))
                .collect(Collectors.toList());
    }
}
