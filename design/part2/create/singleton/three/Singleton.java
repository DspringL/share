package part2.create.singleton.three;

public class Singleton {
	private static Singleton INSTANCE = null;
	private Singleton () {}
	public static Singleton getInstance() {
		if(null ==INSTANCE) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
}
