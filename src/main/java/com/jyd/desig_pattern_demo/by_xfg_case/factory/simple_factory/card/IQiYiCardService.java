package com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory.card;

/**
 * 模拟爱奇艺会员卡服务
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }

}