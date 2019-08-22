package com.riletian.rule.two.part4;

public class MemberAuthorize extends AbstractMemberAuthorize{

	@Override
	public Long login(String username, String password) {
		System.out.println(username+"：会员登录成功");
		return 1L;
	}

	@Override
	public Long reg(String username, String password) {
		System.out.println(username+"：会员注册成功");
		return 1L;
	}

	@Override
	public boolean logout(Long uId) {
		System.out.println(uId+"：会员登出成功");
		return true;
	}

	@Override
	public boolean off(Long uId) {
		System.out.println(uId+"：会员注销成功");
		return true;
	}

}
