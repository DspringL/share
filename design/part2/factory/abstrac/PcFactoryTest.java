package design.part2.factory.abstrac;

import org.junit.jupiter.api.Test;

class PcFactoryTest {
	@Test
	void test() {
		PcFactory dellFactory = new DellFactory();
		Mouse dellMouse = dellFactory.makeMouse();
		dellMouse.make();
		Keybo dellKeybo = dellFactory.makeKeybo();
		dellKeybo.make();
		
		PcFactory hpFactory = new HpFactory();
		Mouse hpMouse = hpFactory.makeMouse();
		hpMouse.make();
		Keybo hpKeybo = hpFactory.makeKeybo();
		hpKeybo.make();
	}
}
