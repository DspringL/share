package com.riletian.rule.four.plan1;

import org.junit.jupiter.api.Test;

public class CalcTest {

	@Test
	public void test() {
		FirstGenerationCalculator calc = new FirstGenerationCalculator();
		int addResult = calc.add(1, 2);
		System.out.println(addResult);
		
		FirstGenerationCalculator calc2 = new SecondGenerationCalculator();
		int addResult2 = calc2.add(1, 2);
		System.out.println(addResult2);
	}
}
