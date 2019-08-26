package part1.five.plan2;

import org.junit.jupiter.api.Test;

class CarShopTest {

	@Test
	void testSell() {
		CarShop carShop = new CarShop();
		carShop.sell(new Bus());
		carShop.sell(new Bike());
	}

}
