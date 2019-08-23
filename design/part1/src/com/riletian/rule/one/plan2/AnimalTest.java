package com.riletian.rule.one.plan2;

import org.junit.jupiter.api.Test;

class AnimalTest {
	@Test
	void testEat() {
		HerbivoreAnimal hAnimal = new HerbivoreAnimal();
		hAnimal.eat("山羊");
		hAnimal.eat("兔子");

		RaptatorialAnimal rAnimal = new RaptatorialAnimal();
		rAnimal.eat("老虎");
		rAnimal.eat("狮子");
	}
}
