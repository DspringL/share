package com.riletian.rule.two.part3;
/**
 * 基础鉴权接口
 * @author lwz
 *
 */
public interface IAuthorizeService {
	//登录
	public Long login(String username,String password);
	//登出
	public boolean logout(Long uId);
}