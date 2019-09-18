package design.part2.factory.improve;

import org.junit.jupiter.api.Test;

class FactoryTest {
	@Test
	void test() {
		Mouse dellMouse = Factory.makeMouse(0);
		dellMouse.make();
		Keybo dellKeybo = Factory.makeKeybo(0);
		dellKeybo.make();
		Mic dellMic = Factory.makeMic(0);
		dellMic.make();
		
		Mouse hpMouse = Factory.makeMouse(1);
		hpMouse.make();
		Keybo hpKeybo = Factory.makeKeybo(1);
		hpKeybo.make();
		Mic hpMic = Factory.makeMic(1);
		hpMic.make();
	}
}
