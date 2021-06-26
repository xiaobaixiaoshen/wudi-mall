package com.langke.wudimall.ware.dao;

import com.langke.wudimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 18:21:30
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
