package singleton;


class StaticSingleton {
	private static StaticSingleton instance;

	private StaticSingleton() {

	}

	static {
		try {
			instance = new StaticSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating instance");
		}
	}

	public static StaticSingleton getInstance() {
		return instance;
	}

}



public class StaticBlock {

	public static void main(String[] args) {

		StaticSingleton s1 = StaticSingleton.getInstance();
		StaticSingleton s2 = StaticSingleton.getInstance();

		if (s1 == s2) {
			System.out.println("Same Object");
		} else {
			System.out.println("Not Singleton");
		}
	}

}
