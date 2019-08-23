package com.riletian.rule.two.plan1;

public class EmployeeAuthorizeServiceImpl implements IAuthorizeService {
	@Override
	public Long login(String username, String password) {
		System.out.println(username+"：员工，登录成功");
		return 1L;
	}

	@Override
	public Long reg(String username, String password) {
		throw new RuntimeException("请求有误，员工账号不可自行注册");
	}

	@Override
	public boolean logout(Long uId) {
		System.out.println(uId+"：员工，登出成功");
		return true;
	}

	@Override
	public boolean off(Long uId) {
		throw new RuntimeException("请求有误，员工账号不注销");
	}

}
