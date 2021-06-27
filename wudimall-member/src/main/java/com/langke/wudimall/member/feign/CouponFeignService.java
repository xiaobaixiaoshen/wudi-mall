package com.langke.wudimall.member.feign;

import com.langke.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LangKe
 * @description
 * @date 2021/6/27 18:22
 */
@FeignClient("wudimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")	//该服务的方法地址
    public R memberCoupons();	//方法名
}
