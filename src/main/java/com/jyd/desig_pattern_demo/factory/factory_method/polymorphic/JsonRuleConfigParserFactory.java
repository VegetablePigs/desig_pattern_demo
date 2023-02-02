package com.jyd.desig_pattern_demo.factory.factory_method.polymorphic;

import com.jyd.desig_pattern_demo.factory.simple_factory.IRuleConfigParser;
import com.jyd.desig_pattern_demo.factory.simple_factory.JsonRuleConfigParser;

/**
 * json规则配置解析器工厂
 *
 * @author jyd
 * @date 2023/02/02 17:07:45
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
  @Override
  public IRuleConfigParser createParser() {
    return new JsonRuleConfigParser();
  }
}