package com.trainning.coreJava;

public class Test  {

	public static void main(String[] args) {
		
		int age = 20;
		int weight = 50;
		 
		String result = (age > 18 && weight > 50) ? "You are eligible to donate blood":
			"You are not eligible to donate blood";  
		System.out.println(result);
	}
}	
