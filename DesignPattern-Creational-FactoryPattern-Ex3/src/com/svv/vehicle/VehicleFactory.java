package com.svv.vehicle;

public class VehicleFactory {
	
	public String getVin(String vehType)
	{
		if(vehType.equalsIgnoreCase("car"))
		{
			Car car = new Car();
			return car.generateVin();
		}
		if(vehType.equalsIgnoreCase("bus"))
		{
			Bus bus = new Bus();
			return bus.generateVin();
		}
		if(vehType.equalsIgnoreCase("truck"))
		{
			Truck truck = new Truck();
			return truck.generateVin();
		}
		return null;
	}

}
