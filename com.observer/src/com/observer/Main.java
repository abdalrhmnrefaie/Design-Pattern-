package com.observer;

public class Main {

	public static void main(String[] args) {

		IObserver conditionsMonitor = new ConditionsMonitor();

		WeatherStation weatherStation = new WeatherStation();
		weatherStation.addObserver(conditionsMonitor);

		/*
		  A change in any values in subject leads to observer triggering updateValue method and printing updated values.
		 */
		 
		weatherStation.setHumidity(200.0);
	}

}
