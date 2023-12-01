package com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        } else if (1 == commodityType) {
            return new CouponCommodityService();
        } else if (2 == commodityType) {
            return new GoodsCommodityService();
        } else if (3 == commodityType) {
            return new CardCommodityService();
        } else {
            throw new RuntimeException("不存在的商品服务类型");
        }
    }

}
