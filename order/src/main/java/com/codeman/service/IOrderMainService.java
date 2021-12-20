package com.codeman.service;

import com.codeman.domain.OrderMain;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-20
 */
public interface IOrderMainService extends IService<OrderMain> {
    /**"
     * 传递订单，生成订单
     * @param orderMain
     */
    void createOrder(OrderMain orderMain);
}
