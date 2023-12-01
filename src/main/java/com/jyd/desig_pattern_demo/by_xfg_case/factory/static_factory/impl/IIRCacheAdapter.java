package com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory.impl;


import com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory.ICacheAdapter;
import com.jyd.desig_pattern_demo.by_xfg_case.factory.static_factory.matter.IIR;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }
    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }
    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }
    @Override
    public void del(String key) {
        iir.del(key);
    }

}