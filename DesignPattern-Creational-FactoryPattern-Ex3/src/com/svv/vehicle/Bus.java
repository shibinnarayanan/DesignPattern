package com.svv.vehicle;

public class Bus implements Vehicle {

	@Override
	public String generateVin() {
		
		if(Client.busCounter == 9999)
		{
			Client.busCounter = 0;
		}

		Client.busCounter++;
		
		GenerateRunningSerialNo runningSerial = new GenerateRunningSerialNo();
		
		String runningDig = runningSerial.generateRunningDig(Client.busCounter);

		String vin = "BUS:" + runningDig;

		return vin;
	}
	
	

}
