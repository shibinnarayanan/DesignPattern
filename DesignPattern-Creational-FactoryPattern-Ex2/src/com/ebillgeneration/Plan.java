package com.ebillgeneration;

public abstract class Plan {
	
	protected double rate; 
//	protected String planName;
    abstract void getRate(); 
//    abstract void getPlanName();
    

    public void calculateBill(int units){  
         System.out.println("Bill generated : "+Math.round(units*rate)+" Rs/");  
     }  

}
