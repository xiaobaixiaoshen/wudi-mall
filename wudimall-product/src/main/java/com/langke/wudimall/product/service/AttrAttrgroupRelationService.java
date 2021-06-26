package com.langke.wudimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.langke.common.utils.PageUtils;
import com.langke.wudimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 16:07:26
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

