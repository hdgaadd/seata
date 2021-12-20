package com.codeman.service;

import com.codeman.domain.OrderMain;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author hdgaadd
 * Created on 2021/12/20
*/
@FeignClient("main-order")
public interface OrderService {
    @PostMapping("/codeman/order-main/createOrder")
    public void createOrder(OrderMain orderMain);
}