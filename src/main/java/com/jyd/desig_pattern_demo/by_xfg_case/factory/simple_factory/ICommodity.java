package com.jyd.desig_pattern_demo.by_xfg_case.factory.simple_factory;

import java.util.Map;

public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId,
                       Map<String, String> extMap) throws Exception;
}