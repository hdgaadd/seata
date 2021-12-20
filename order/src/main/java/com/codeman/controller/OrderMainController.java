package com.codeman.controller;


import com.codeman.domain.OrderMain;
import com.codeman.service.IOrderMainService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-20
 */
@RestController
@Api("订单管理")
@RequestMapping("/codeman/order-main")
public class OrderMainController {
    @Resource
    private IOrderMainService orderMainService;

    @ApiOperation("传递订单，生成订单")
    @PostMapping("/createOrder")
    public void createOrder(OrderMain orderMain) {
        orderMainService.createOrder(orderMain);
    }
}

