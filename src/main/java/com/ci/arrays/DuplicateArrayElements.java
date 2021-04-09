package com.ci.arrays;

public class DuplicateArrayElements {
	
	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 3, 2, 4, 5, 5, 6, 7, 8, 5, 1};
		
		for(int i=0; i<arr.length; i++) {
			for(int k=i; k>=0; k--) {
				if(arr[i] == arr[k]) {
					break;
				}
				for(int j=i+1; j<arr.length; j++) {
						
					if(arr[i] == arr[j]) {
						System.out.println(arr[i]);
						break;
					}
				}
			}
		}
	}
}
