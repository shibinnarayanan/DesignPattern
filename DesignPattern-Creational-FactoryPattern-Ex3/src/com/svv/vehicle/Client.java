package com.svv.vehicle;

import java.util.Scanner;

public class Client {

	public static int carCounter = 0;
	public static int busCounter = 0;
	public static int truckCounter = 0;
	

	public static void main(String[] args) {

		try {
			VehicleFactory vf = new VehicleFactory();

			/* Vin -> Vehicle Identification Number */
			
			System.out.println("Enter vehicle type to get Vin generated ..");

			Scanner scanner = new Scanner(System.in);

			String vehType = scanner.nextLine();

			while (!vehType.equals("exit")) {

				String vin = vf.getVin(vehType);

				System.out.println("Vin generated for " + vehType.toUpperCase() + " is " + vin);


				System.out.println("\nEnter vehicle type to get Vin generated ..");

				vehType = scanner.nextLine();
			}

		} catch (Exception e) {
			
			
			
			System.out.println(e.getLocalizedMessage());

		}

	}

}
