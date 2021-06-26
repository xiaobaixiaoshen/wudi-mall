package com.langke.wudimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.langke.common.utils.PageUtils;
import com.langke.wudimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 18:14:05
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

