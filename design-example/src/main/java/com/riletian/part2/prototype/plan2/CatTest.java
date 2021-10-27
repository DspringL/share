package com.riletian.part2.prototype.plan2;

import org.junit.jupiter.api.Test;


class CatTest {

	@Test
	void test() throws CloneNotSupportedException {
		Cat appleCat = new Cat("apple", 2);
		Cat appleCat1 = appleCat.clone();
		Cat appleCat2 = appleCat.clone();
		Cat appleCat3 = appleCat.clone();
		System.out.println(appleCat.hashCode());
		System.out.println(appleCat1.hashCode());
		System.out.println(appleCat2);
		System.out.println(appleCat3);
	}

}
