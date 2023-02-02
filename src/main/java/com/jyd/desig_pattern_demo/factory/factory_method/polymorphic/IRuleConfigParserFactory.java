package com.jyd.desig_pattern_demo.factory.factory_method.polymorphic;

import com.jyd.desig_pattern_demo.factory.simple_factory.IRuleConfigParser;

/**
 * irule配置解析器工厂
 *
 * @author jyd
 * @date 2023/02/02 17:07:13
 */
public interface IRuleConfigParserFactory {
  IRuleConfigParser createParser();
}