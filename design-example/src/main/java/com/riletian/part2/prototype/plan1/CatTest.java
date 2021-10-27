package com.riletian.part2.prototype.plan1;

import org.junit.jupiter.api.Test;

class CatTest {

	@Test
	void test() {
		Cat appleCat = new Cat("apple", 2);
		Cat appleCat1 = new Cat(appleCat.getName(), appleCat.getAge());
		Cat appleCat2 = new Cat(appleCat.getName(), appleCat.getAge());
		Cat appleCat3 = new Cat(appleCat.getName(), appleCat.getAge());
		System.out.println(appleCat);
		System.out.println(appleCat1);
		System.out.println(appleCat2);
		System.out.println(appleCat3);
	}

}
