package com.jyd.desig_pattern_demo.factory.simple_factory;


import com.jyd.desig_pattern_demo.factory.factory_method.polymorphic.RuleConfig;

/**
 * 配置分析器
 *
 * @author jyd
 * @date 2023/02/02 16:56:45
 */
public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}
