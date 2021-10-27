package com.riletian.part2.factory.improve;

/**
 * 具体产品-惠普耳机
 * @author lwz
 *
 */
public class HpMic extends Mic {
	@Override
	public void make() {
		System.out.println("生产了惠普耳机");
	}
}
