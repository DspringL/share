package com.riletian.rule.three.plan1;

import org.junit.jupiter.api.Test;

class PhoneTest {

	@Test
	void testReceiveSms() {
		Phone phone = new Phone();
		phone.receive(new Sms());
	}

}
