package part2.create.singleton.two;

public class Singleton {
	private static final Singleton INSTANCE;
	static {
		INSTANCE = new Singleton();
	}
	private Singleton() {}
	public static Singleton getInstance() {
		return INSTANCE;
	}
}
