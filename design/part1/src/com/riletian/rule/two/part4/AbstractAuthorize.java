package com.riletian.rule.two.part4;
/**
 * 基础鉴权抽象类
 * @author lwz
 *
 */
public abstract class AbstractAuthorize {
	//登录
	public abstract Long login(String username,String password);
	//登出
	public abstract boolean logout(Long uId);
}
