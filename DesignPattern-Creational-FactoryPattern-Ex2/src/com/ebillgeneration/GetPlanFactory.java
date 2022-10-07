package com.ebillgeneration;

public class GetPlanFactory {
	
	public static Plan getPlan(int plan) {
		
		try {
			
			Plan pln = null;
			switch (plan) {
			case 1:
				pln = new DomesticPlan();
				break;
			case 2:
				pln = new CommercialPlan();
				break;
			case 3:
				pln = new InstitutionalPlan();
				break;
	 
			default:
				break;
			}
			
			return pln;
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return null;
		
		
	}

}
