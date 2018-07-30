package com.heaps.ravindra;

public class FindMaxElementInMinHeap {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int max = findMax(arr);
		
		System.out.println("Max:" + max);

	}

	public static int findMax(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i=arr.length/2 ;i<arr.length;i++){
			if(arr[i] >max){
				max = arr[i];
			}
		}
		return max;
	}
}
