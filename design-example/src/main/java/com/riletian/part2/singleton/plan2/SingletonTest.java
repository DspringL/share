package com.riletian.part2.singleton.plan2;

import com.riletian.part2.singleton.plan1.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() {
		Singleton singleton = Singleton.getInctance();
		System.out.println(singleton.hashCode());
		
		Singleton singleton2 = Singleton.getInctance();
		System.out.println(singleton2.hashCode());
		Assertions.assertEquals(singleton, singleton2);
	}

}
