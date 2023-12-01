package com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory;

import com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory.impl.EGMCacheAdapter;
import com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory.impl.IIRCacheAdapter;

/**
 * @Author: jyd
 * @Date: 2023/12/01 15:40
 * @Version: 1.0
 * @Description:
 **/
public class TestCacheService {
    public static void main(String[] args) throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01","小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println(val01);
        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01","小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println(val02);
    }
}