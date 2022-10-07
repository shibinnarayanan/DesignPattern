package com.ebillgeneration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) {

		while (true) {

			try {

				GetPlanFactory plnFac = new GetPlanFactory();

				System.out.println("Select Plan , 1)Domestic 2)Commercial 3)Institutiona");

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				int planNo = Integer.parseInt(br.readLine());
//			
//			System.out.println("\n");

				System.out.println("Enter unit consumed");

				int unit = Integer.parseInt(br.readLine());

				Plan Plan = plnFac.getPlan(planNo);

				Plan.getRate();
				Plan.calculateBill(unit);
				System.out.println("--------------------------------------------------\n");

			} catch (IOException e) {
				System.out.println("Error : " + e.getMessage());
				System.out.println("--------------------------------------------------\n");
			} catch (Exception e) {
				System.out.println("Error : " + e.getLocalizedMessage());
				System.out.println("--------------------------------------------------\n");
			}
		}

	}

}
