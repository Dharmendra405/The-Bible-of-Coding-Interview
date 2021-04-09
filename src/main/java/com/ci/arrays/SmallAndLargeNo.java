package com.ci.arrays;

public class SmallAndLargeNo {	
	
	
	//find greater and smaller no from the unsorted array
	public static void main(String[] args) {
		
		int small = 0;
		int large = 0;
		
		int arr[] = new int[] {10, 40, 90, 100, 700, 600, 9, 900, 220};
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]> arr[j]) {
					large=arr[i];
				}else {
					small=arr[i];
				}
			}
		}
		System.out.println("Greater no is "+ large);
		System.out.println("Smaller no is "+ small);
		
	}

}
