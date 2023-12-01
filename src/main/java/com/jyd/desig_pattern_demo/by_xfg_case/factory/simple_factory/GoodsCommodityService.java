package com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory;

import cn.hutool.json.JSONUtil;
import com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory.goods.DeliverReq;
import com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory.goods.GoodsService;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Author: jyd
 * @Date: 2023/12/01 14:46
 * @Version: 1.0
 * @Description: 实物商品服务
 *
 **/
@Slf4j
public class GoodsCommodityService implements ICommodity {

    private GoodsService goodsService = new GoodsService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSONUtil.toJsonStr(extMap));
        log.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}