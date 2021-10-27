package com.riletian.part2.factory.old;

import org.junit.jupiter.api.Test;

public class ShopTest {
	@Test
	public void buyTest() {
		Mouse dellMouse = AShop.buy(0);
		dellMouse.make();
		Mouse hpMouse = AShop.buy(1);
		hpMouse.make();
	}
}
