package part1.one.plan2;

import org.junit.jupiter.api.Test;

class AnimalTest {
	@Test
	void testLife() {
		WaterAnimal wAnimal = new WaterAnimal();
		wAnimal.life("鲨鱼");
		wAnimal.life("鲸鱼");

		LandAnimal lAnimal = new LandAnimal();
		lAnimal.life("老虎");
		lAnimal.life("狮子");
	}
}
