package com.codeman.service;

import com.codeman.domain.Account;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-20
 */
public interface IAccountService extends IService<Account> {
    /**
     * 传递userId、amount扣减钱包
     * @param userId
     * @param amount
     */
    void decrease(Long userId, BigDecimal amount);
}
