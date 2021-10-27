package com.riletian.part2.factory.abstrac;

/**
 * 具体产品-戴尔键盘
 * @author lwz
 *
 */
public class DellKeybo extends Keybo {
	@Override
	public void make() {
		System.out.println("生产了戴尔键盘");
	}
}
