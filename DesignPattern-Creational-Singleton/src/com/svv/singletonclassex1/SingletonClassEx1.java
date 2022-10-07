package com.svv.singletonclassex1;

public class SingletonClassEx1 {
	
	 private static SingletonClassEx1 singleton = null;
	 
	 private SingletonClassEx1()
	 {
		 
	 }
	 
	 public static SingletonClassEx1 getSingletonInstance()
	 {
		 if(singleton == null)
		 {
			 singleton = new SingletonClassEx1();
		 }
		 
		 return singleton;
	 }
	 
	 
	 public static void main(String[] args) {
		 
		 SingletonClassEx1 obj1 = SingletonClassEx1.getSingletonInstance();
		 
		 SingletonClassEx1 obj2 = SingletonClassEx1.getSingletonInstance();
		 
		 System.out.println(obj1);
		 
		 System.out.println(obj2);
		 
		
	}
	

}
