package com.langke.wudimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.langke.common.utils.PageUtils;
import com.langke.wudimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 18:14:05
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

