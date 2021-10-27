package com.riletian.part2.factory.improve;

/**
 * 具体产品-惠普鼠标
 * @author lwz
 *
 */
public class HpMouse extends Mouse {
	@Override
	public void make() {
		System.out.println("生产了惠普鼠标");
	}
}
