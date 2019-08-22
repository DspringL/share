package com.riletian.rule.five.part2;

import org.junit.jupiter.api.Test;

class CarShopTest {

	@Test
	void testSell() {
		CarShop carShop = new CarShop();
		carShop.sell(new Bus());
		carShop.sell(new Bike());
	}

}
