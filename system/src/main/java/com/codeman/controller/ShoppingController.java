package com.codeman.controller;

import com.codeman.domain.OrderMain;
import com.codeman.service.AccountService;
import com.codeman.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hdgaadd
 * Created on 2021/12/20
 */
@Api(tags = "seata管理")
@RestController
@RequestMapping("/system")
public class ShoppingController {
    @Resource
    private AccountService accountService;
    @Resource
    private OrderService orderService;

    @ApiOperation("seate操作")
    @PostMapping("/shopping")
    public void shopping(OrderMain orderMain) {
        orderService.createOrder(orderMain);
        accountService.decrease(orderMain.getUserId(), orderMain.getAmount());
    }
}
