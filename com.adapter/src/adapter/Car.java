package adapter;

public class Car  implements Vehicle{

	@Override
	public void accelerate() {

		System.out.println("Car starts to move");
	}

	@Override
	public void push_Break() {
        System.out.println("Car Stopped");
		
	}

	@Override
	public void sound_Horn() {

        System.out.println("Beeb Beep");

	}

}
