package com.chuanyu.onlinesell.repository;

import com.chuanyu.onlinesell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456701");
        orderDetail.setOrderId("121210");
        orderDetail.setProductId("121215");
        orderDetail.setProductIcon("https://aaa.jpg");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(6.8));
        orderDetail.setProductQuantity(2);
        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(result);

    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = orderDetailRepository.findByOrderId("121210");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}