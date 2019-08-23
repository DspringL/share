package com.riletian.rule.two.plan3;

/**
 * 会员鉴权接口
 * @author lwz
 *
 */
public interface IMemberAuthorizeService extends IAuthorizeService {
	//注册
	public Long reg(String username,String password);
	//注销
	public boolean off(Long uId);
}
