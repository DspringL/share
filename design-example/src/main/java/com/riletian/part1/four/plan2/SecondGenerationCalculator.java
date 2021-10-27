package com.riletian.part1.four.plan2;

public class SecondGenerationCalculator extends BaseCalculator {
	//使用组合关系使用一代计算器
	private FirstGenerationCalculator firstCalc = new FirstGenerationCalculator();
	public int add(int n1, int n2) {
		return firstCalc.add(n1, n2);
	}
	public int sub(int n1,int n2) {
		return n1 - n2;
	}
}
