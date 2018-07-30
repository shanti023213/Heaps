package com.heaps.ravindra;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class a3PlusB2ElementsInSortedArray {

	public static void main(String[] arg){
	
		printRangeinSortedArray(2,6);
	}
	
	public static void printRangeinSortedArray(int start, int end){
		
		int range = end-start+1;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		int[][] arr = new int[range][range];
		for(int i=0;i<range;i++){
			for(int j=0;j<range;j++){
				arr[i][j] = (int) (Math.pow(start+i, 3)+ Math.pow(start+j, 3));
				queue.add(arr[i][j]);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(!queue.isEmpty()){
			list.add(queue.poll());
		}
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
	
}
