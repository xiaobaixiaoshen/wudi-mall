package com.langke.wudimall.product.dao;

import com.langke.wudimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 16:07:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
