package com.jyd.desig_pattern_demo.proxy.static_proxy;

/**
 * 被代理类
 *
 * @author jyd
 * @date 2023/02/09 10:44:58
 */
public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(" 老师授课中  。。。。。");
	}
}