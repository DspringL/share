package com.riletian.part1.one.plan1;

import org.junit.jupiter.api.Test;

class AnimalTest {
	@Test
	void testLife() {
		Animal animal = new Animal();
		animal.life("鲨鱼");
		animal.life("鲸鱼");
		animal.life("老虎");
		animal.life("狮子");
	}
}
