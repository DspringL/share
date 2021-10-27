package com.riletian.part2.singleton.plan1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonTest {

	@Test
	void test() {
		Singleton singleton = Singleton.getInctance();
		System.out.println(singleton.hashCode());
		
		Singleton singleton2 = Singleton.getInctance();
		System.out.println(singleton2.hashCode());
		
		assertEquals(singleton, singleton2);
	}

}
