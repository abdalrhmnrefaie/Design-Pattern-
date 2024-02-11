package singleton;

 enum SingletonEnum {
    INSTANCE;
	 
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class EnumDemo {
	

	public static void main(String[] args) {

        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(5);
        System.out.println(singleton.getValue());


	}
	

}
