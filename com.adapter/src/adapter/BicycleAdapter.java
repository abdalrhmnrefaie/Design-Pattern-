package adapter;

public class BicycleAdapter implements Vehicle {
	
	
    private Bicycle bicycle;


    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

	@Override
	public void accelerate() {

        bicycle.start();

	}

	@Override
	public void push_Break() {

        bicycle.stop();

	}

	@Override
	public void sound_Horn() {

        bicycle.ringBell();

	}

}
