package com.riletian.part2.factory.simple;


import org.junit.jupiter.api.Test;
public class MouseFactoryTest {
	@Test
	void test() {
		//生产戴尔鼠标
		Mouse mouse = MouseFactory.makeMouse(0);
		mouse.make();
		
		//生产惠普鼠标
		Mouse mouse2 = MouseFactory.makeMouse(1);
		mouse2.make();
	}
}
