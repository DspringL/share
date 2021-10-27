package com.riletian.part2.factory.method;

/**
 * 具体产品-戴尔鼠标
 * @author lwz
 *
 */
public class DellMouse extends Mouse {
	@Override
	public void make() {
		System.out.println("生产了戴尔鼠标");
	}
}
