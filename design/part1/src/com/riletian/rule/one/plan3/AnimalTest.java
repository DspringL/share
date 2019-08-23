package com.riletian.rule.one.plan3;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void test() {
        Animal animal = new Animal();
        animal.eat("山羊");
        animal.eat("兔子");
        animal.eatMeat("老虎");
        animal.eatMeat("狮子");
	}

}
