package com.jyd.desig_pattern_demo.strategy;

import java.io.FileInputStream;
import java.util.Properties;

public class Application {

  // 运行时动态确定，根据配置文件的配置决定使用哪种策略
  public static void main(String[] args) throws Exception {
    EvictionStrategy evictionStrategy = null;
    Properties props = new Properties();
    props.load(new FileInputStream("./config.properties"));
    String type = props.getProperty("eviction_type");
    evictionStrategy = EvictionStrategyFactory.getEvictionStrategy(type);
    UserCache userCache = new UserCache(evictionStrategy);
    // ...
  }

  // 非运行时动态确定，在代码中指定使用哪种策略
  /*public static void main(String[] args) {
    // ...
    EvictionStrategy evictionStrategy = new LruEvictionStrategy();
    UserCache userCache = new UserCache(evictionStrategy);
    // ...
  }*/
}