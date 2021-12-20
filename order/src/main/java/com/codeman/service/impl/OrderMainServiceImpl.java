package com.codeman.service.impl;

import com.codeman.domain.OrderMain;
import com.codeman.mapper.OrderMainMapper;
import com.codeman.service.IOrderMainService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import util.LOG;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hdgaadd
 * @since 2021-12-20
 */
@Service
public class OrderMainServiceImpl extends ServiceImpl<OrderMainMapper, OrderMain> implements IOrderMainService {
    @Resource
    private OrderMainMapper orderMainMapper;

    @Override
    public void createOrder(OrderMain orderMain) {
        orderMain.setCode(UUID.randomUUID().toString());
        orderMainMapper.insert(orderMain);
        LOG.log("创建订单成功");
    }
}
