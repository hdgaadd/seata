package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.domain.Account;
import com.codeman.mapper.AccountMapper;
import com.codeman.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import util.LOG;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-20
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal amount) {
        QueryWrapper<Account> accountQueryWrapper = new QueryWrapper<>();
        accountQueryWrapper.eq("user_id", userId);
        Account account = accountMapper.selectOne(accountQueryWrapper);

        account.setBalance(account.getBalance().subtract(amount));

        accountMapper.updateById(account);
        LOG.log("扣减钱包成功");
    }
}
