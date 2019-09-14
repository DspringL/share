package part2.create.singleton.six;

public class Singleton {
	private static volatile Singleton INSTANCE = null;

	private Singleton() {}

	public static Singleton getInstance() {
		if (null == INSTANCE) {
			synchronized (Singleton.class) {
				if(null ==INSTANCE)
				INSTANCE = new Singleton();
			}
		}
		return INSTANCE;
	}
}
