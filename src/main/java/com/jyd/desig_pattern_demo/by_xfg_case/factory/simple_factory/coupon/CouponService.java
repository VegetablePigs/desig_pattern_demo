package com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory.coupon;

/**
 * 模拟优惠券服务
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}