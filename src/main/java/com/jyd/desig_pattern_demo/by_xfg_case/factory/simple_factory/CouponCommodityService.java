package com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory;

import cn.hutool.json.JSONUtil;
import com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory.coupon.CouponResult;
import com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory.coupon.CouponService;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Author: jyd
 * @Date: 2023/12/01 14:12
 * @Version: 1.0
 * @Description: 优惠卷实现
 **/
@Slf4j
public class CouponCommodityService implements ICommodity{

    private CouponService couponService = new CouponService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId,
                commodityId, bizId);
        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSONUtil.toJsonStr(extMap));
        log.info("测试结果[优惠券]：{}", JSONUtil.toJsonStr(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}