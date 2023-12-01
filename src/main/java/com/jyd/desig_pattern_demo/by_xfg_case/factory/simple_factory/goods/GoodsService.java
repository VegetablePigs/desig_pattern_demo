package com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory.goods;

import com.alibaba.fastjson.JSON;

/**
 * 模拟实物商品服务
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}