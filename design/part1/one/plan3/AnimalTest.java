package design.part1.one.plan3;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void test() {
        Animal animal = new Animal();
        animal.life("鲸鱼");
        animal.life("鲨鱼");
        animal.lifeOnLand("老虎");
        animal.lifeOnLand("狮子");
	}

}
