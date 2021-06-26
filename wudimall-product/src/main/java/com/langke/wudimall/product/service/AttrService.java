package com.langke.wudimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.langke.common.utils.PageUtils;
import com.langke.wudimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 16:07:26
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

