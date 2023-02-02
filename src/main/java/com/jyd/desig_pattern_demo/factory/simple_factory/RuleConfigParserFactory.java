package com.jyd.desig_pattern_demo.factory.simple_factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 规则配置解析器工厂  简单工厂方法
 * 把创建的对象缓存起来 当调用 createParser() 函数的时候，我们从缓存中取出 parser 对象直接使用。
 * @author jyd
 * @Date: 2023/02/02 16:44
 * @Company:
 * @Version: 1.0
 */
public class RuleConfigParserFactory {
    private static final Map<String,RuleConfigParser> cachedParsers = new HashMap<String,RuleConfigParser>();
    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;//返回null还是IllegalArgumentException全凭你自己说了算
        }
        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}
