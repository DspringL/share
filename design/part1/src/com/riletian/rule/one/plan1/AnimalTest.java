package com.riletian.rule.one.plan1;

import org.junit.jupiter.api.Test;

class AnimalTest {
	@Test
	void testEat() {
		Animal animal = new Animal();
		animal.eat("山羊");
		animal.eat("兔子");
		animal.eat("老虎");
		animal.eat("狮子");

	}
}
