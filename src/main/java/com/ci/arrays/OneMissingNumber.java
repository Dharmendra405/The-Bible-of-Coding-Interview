package com.ci.arrays;

public class OneMissingNumber {
	
	//Problem Statement
	//How do you find one missing number in a given integer array of N?
	
	public static void main(String []args) {
		
		int arr[] = new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int size = 10;
		
		int actualSum = size*(size+1)/2;
		
		int mySum = 0;
		
		for(int no: arr) {
			mySum += no;
		}
		
		System.out.println(actualSum - mySum);
	}
}
