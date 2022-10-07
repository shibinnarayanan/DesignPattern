package com.svv.vehicle;

public class Car implements Vehicle {

	@Override
	public String generateVin() {

		if (Client.carCounter == 9999) {
			Client.carCounter = 0;
		}

		Client.carCounter++;

		GenerateRunningSerialNo runningSerial = new GenerateRunningSerialNo();

		String runningDig = runningSerial.generateRunningDig(Client.carCounter);

		String vin = "CAR:" + runningDig;

		return vin;
	}

}
