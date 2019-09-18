package design.part2.factory.method;

import org.junit.jupiter.api.Test;

class MouseFactoryTest {
	@Test
	void test() {
		MouseFactory dellMouseFactory = new DellMouseFactory();
		Mouse dellMouse = dellMouseFactory.makeMouse();
		dellMouse.make();
		
		MouseFactory hpMouseFactory = new HpMouseFactory();
		Mouse hpMouse = hpMouseFactory.makeMouse();
		hpMouse.make();
	}
}
