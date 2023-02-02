package com.jyd.desig_pattern_demo.factory.factory_method.polymorphic;

import com.jyd.desig_pattern_demo.factory.simple_factory.IRuleConfigParser;
import com.jyd.desig_pattern_demo.factory.simple_factory.PropertiesRuleConfigParser;

/**
 * 财产规则配置解析器工厂
 *
 * @author jyd
 * @date 2023/02/02 17:08:48
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
  @Override
  public IRuleConfigParser createParser() {
    return new PropertiesRuleConfigParser();
  }
}