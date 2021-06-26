package com.langke.wudimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.langke.common.utils.PageUtils;
import com.langke.wudimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 18:21:30
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

