package design.part1.three.plan2;

import org.junit.jupiter.api.Test;

class PhoneTest {

	@Test
	void testReveice() {
		Phone phone = new Phone();
		phone.receive(new Sms());
		phone.receive(new Email());
	}

}
