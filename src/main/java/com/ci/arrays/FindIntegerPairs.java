package com.ci.arrays;

public class FindIntegerPairs {
	
	//How do you find all pairs of an integer array whose sum is equal to a given number?
	
	public static void main(String [] args) {
		
		int arr[] = new int[] {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		int sum = 11;
		int pairs = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					pairs++;
				}
			}
		}
		System.out.println("Total pairs with sum "+sum+" is " +pairs);
	}
}