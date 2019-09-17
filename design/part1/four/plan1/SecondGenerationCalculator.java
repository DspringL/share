package design.part1.four.plan1;

public class SecondGenerationCalculator extends FirstGenerationCalculator {
	@Override
	public int add(int n1, int n2) {
		return n1 * n2;
	}
	public int sub(int n1,int n2) {
		return n1 - n2;
	}
}
