package com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory.impl;


import com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory.ICacheAdapter;
import com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory.matter.EGM;

import java.util.concurrent.TimeUnit;

public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}