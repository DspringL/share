package part2.create.singleton.five;

public class Singleton {
	private static Singleton INSTANCE = null;

	private Singleton() {}

	public static Singleton getInstance() {
		if (null == INSTANCE) {
			synchronized (Singleton.class) {
				INSTANCE = new Singleton();
			}
		}
		return INSTANCE;
	}
}
