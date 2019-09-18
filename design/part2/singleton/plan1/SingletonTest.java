package design.part2.singleton.plan1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

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
