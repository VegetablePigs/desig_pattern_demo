package com.jyd.desig_pattern_demo.singleton;


/**
 * 单例模式 双重检测
 *
 * @author jyd
 * @date 2023/02/02 11:03:08
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
