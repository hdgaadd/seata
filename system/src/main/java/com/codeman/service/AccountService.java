package com.codeman.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author hdgaadd
 * Created on 2021/12/20
*/
@FeignClient("account")
public interface AccountService {
    @PostMapping("/codeman/account/decrease")
    public void decrease(@RequestParam Long userId, @RequestParam BigDecimal amount);
}