package com.riletian.rule.three.part2;

/**
 * 手机类
 * @author lwz
 *
 */
public class Phone {
	public void receive(IMsg msg) {
		String message = msg.getInfo();
		System.out.println(message);
	}
}
