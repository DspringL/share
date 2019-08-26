package part1.five.plan1;

import org.junit.jupiter.api.Test;

class CarShopTest {

	@Test
	void testMake() {
		CarShop carShop = new CarShop();
		carShop.sell(new Bus());
		carShop.sell(new Bike());
	}

}
