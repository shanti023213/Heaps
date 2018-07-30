package com.heaps.ravindra;

import java.util.PriorityQueue;

public class RopesMinCost {

	public static void main(String[] args) {
		int[] arr = {10,15,13,22,11};
		int minCost = minCost(arr);
		System.out.println(minCost);
	}
	
	public static int minCost(int[] arr){
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=0;i<arr.length;i++){
			queue.add(arr[0]);
		}
		
		while(queue.size()>1){
			int a = queue.poll();
			int b= queue.poll();
			queue.add(a+b);
		}
		return queue.poll();
	}

}
