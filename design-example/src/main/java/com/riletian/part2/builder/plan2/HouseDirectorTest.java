package com.riletian.part2.builder.plan2;


import org.junit.jupiter.api.Test;

class HouseDirectorTest {
	@Test
	void test() {
		HouseDirector houseDirector = new HouseDirector(new CommonHouseBuilder());
		House commoHouse = houseDirector.constructHouse();
		System.out.println(commoHouse);
		
		HouseDirector houseDirector2 = new HouseDirector(new HignHouseBuilder());
		House higHouse = houseDirector2.constructHouse();
		System.out.println(higHouse);
	}
}
