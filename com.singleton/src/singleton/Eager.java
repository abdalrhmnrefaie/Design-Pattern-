package singleton;


class EagerSingleton {

	// Private static instance is created at the time of class loading
	private static EagerSingleton instance = new EagerSingleton();

	// Constructor made private so that no new instance can be created
	private EagerSingleton() {

	}

	// Static method to return the instance to the client
	public static EagerSingleton getInstance() {
		return instance;
	}
}


public class Eager {

	public static void main(String[] args) {

		EagerSingleton s1 = EagerSingleton.getInstance();
		EagerSingleton s2 = EagerSingleton.getInstance();

		if (s1 == s2) {
			System.out.println("Same Object");
		} else {
			System.out.println("Not Singleton");
		}
	}

}
