package com.riletian.part1.three.plan2;

/**
 * 邮件信息类
 * @author lwz
 *
 */
public class Email implements IMsg{
	@Override
	public String getInfo() {
		return "邮件：你好 世界";
	}

}
