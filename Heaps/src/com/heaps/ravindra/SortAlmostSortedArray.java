
package com.heaps.ravindra;

import java.util.PriorityQueue;

public class SortAlmostSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,4,5,2,3,7,8,6,10,9};

		sortArray(arr,2);
	}
	
	public static void sortArray(int[] arr,int k){
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=0;i<=k;i++){
			queue.add(arr[i]);
		}
		
		int j=0;
		for(int i=k+1;i<arr.length;i++){
			arr[j] = queue.poll();
			j++;
			queue.add(arr[i]);
		}
		
		while(!queue.isEmpty()){
			arr[j] =queue.poll();
			j++;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
