package com.svv.vehicle;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class GenerateRunningSerialNo {

	 String generateRunningDig(int Count){

		
		int length = String.valueOf(Count).length(); //String based approach
		
//		int length = (int) (Math.log10(number) + 1);Logarithmic Approach

		String runningDig = "";
		
		if(length == 1)
		{
			runningDig = "000"+Count;
		}
		if(length == 2)
		{
			runningDig = "00"+Count;
		}
		if(length == 3)
		{
			runningDig = "0"+Count;
		}
		if(length == 4)
		{
			runningDig = String.valueOf(Count);
		}
		
		return runningDig;

	}

}
