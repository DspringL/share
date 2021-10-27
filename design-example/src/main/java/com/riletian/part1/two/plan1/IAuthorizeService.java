package com.riletian.part1.two.plan1;

/**
 * 鉴权接口
 * @author lwz
 *
 */
public interface IAuthorizeService {
	//登录
	public Long login(String username,String password);
	//注册
	public Long reg(String username,String password);
	//登出
	public boolean logout(Long uId);
	//注销
	public boolean off(Long uId);
}
