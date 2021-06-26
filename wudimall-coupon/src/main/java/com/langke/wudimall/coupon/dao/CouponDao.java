package com.langke.wudimall.coupon.dao;

import com.langke.wudimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 17:23:33
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
