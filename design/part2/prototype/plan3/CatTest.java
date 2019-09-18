package design.part2.prototype.plan3;

import org.junit.jupiter.api.Test;


class CatTest {

	@Test
	void test() throws CloneNotSupportedException {
		Cat appleCat = new Cat();
		appleCat.setName("apple");
		appleCat.setAge(3);
		Cat bananaCat = new Cat();
		bananaCat.setName("banana");
		bananaCat.setAge(1);
		appleCat.setFriend(bananaCat);
		
		Cat appleCat1 = appleCat.clone();
		Cat appleCat2 = appleCat.clone();
		appleCat2.getFriend().setName("pear");
		appleCat2.getFriend().setAge(3);
		
		System.out.println(appleCat);
		System.out.println(appleCat1);
		System.out.println(appleCat2);
	}
}
