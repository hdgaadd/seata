package com.codeman.controller;


import com.codeman.service.IAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-20
 */
@RestController
@Api("账号管理")
@RequestMapping("/codeman/account")
public class AccountController {
    @Resource
    private IAccountService accountService;

    @ApiOperation("传递userId、amount扣减钱包")
    @PostMapping("/decrease")
    public void decrease(@RequestParam Long userId, @RequestParam BigDecimal amount) {
        accountService.decrease(userId, amount);
    }
}

