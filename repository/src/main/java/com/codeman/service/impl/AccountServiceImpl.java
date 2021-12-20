package com.codeman.service.impl;

import com.codeman.domain.Account;
import com.codeman.mapper.AccountMapper;
import com.codeman.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
