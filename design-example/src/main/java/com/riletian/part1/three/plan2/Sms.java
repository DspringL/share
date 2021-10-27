package com.riletian.part1.three.plan2;

/**
 * 短信信息类
 * @author lwz
 *
 */
public class Sms implements IMsg {
	@Override
	public String getInfo() {
		return "短信：你好 中国";
	}

}
