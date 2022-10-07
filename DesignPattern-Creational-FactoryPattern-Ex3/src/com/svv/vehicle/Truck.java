package com.svv.vehicle;

public class Truck implements Vehicle {

	@Override
	public String generateVin() {
		
		if(Client.truckCounter == 9999)
		{
			Client.truckCounter = 0;
		}

		Client.truckCounter++;

		GenerateRunningSerialNo runningSerial = new GenerateRunningSerialNo();

		String runningDig = runningSerial.generateRunningDig(Client.truckCounter);

		String vin = "TRUCK" + runningDig;

		return vin;
	}

}
