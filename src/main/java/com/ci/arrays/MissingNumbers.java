package com.ci.arrays;

public class MissingNumbers {

	//Problem Statement
	//How do you find all missing number in a given integer array of 1 to 10?
	
	public static void main(String [] args) {
		
		int []arr  = {1, 2, 2, 2, 2, 3, 3, 3, 3, 3};
		
		int register[] = new int[arr.length+1];
		
		for(int i: arr) {
			register[i] = 1;
		}
		
		for(int i=1; i<register.length; i++) {
			if(register[i] == 0) {
				System.out.println(i);
			}
		}
	}
}
