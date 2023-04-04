package com.jyd.desig_pattern_demo.proxy.static_proxy;

/**
 * @Author: jyd
 * @Date: 2023/02/09 10:48
 * @Company:
 * @Version: 1.0
 * @Desc: 代理对象,静态代理
 **/
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target; // 目标对象，通过接口来聚合

    //构造器
    public TeacherDaoProxy(ITeacherDao target){
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理  完成某些操作。。。。。 ");//方法
        target.teach();
        System.out.println("提交。。。。。");//方法
    }
}
