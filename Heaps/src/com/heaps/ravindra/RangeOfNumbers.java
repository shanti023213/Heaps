package com.heaps.ravindra;

import java.util.ArrayList;
import java.util.PriorityQueue;


class MinHeap implements Comparable<MinHeap>{
	int data;
	int rowIndex;
	int columnIndex;
	
	public MinHeap(int data, int rowIndex, int columnIndex){
		this.data= data;
		this.rowIndex =rowIndex;
		this.columnIndex = columnIndex;
	}

	@Override
	public int compareTo(MinHeap minHeap) {
		return this.data-minHeap.data;
	}
}
public class RangeOfNumbers {

	public static void main(String[] args) {
		int[][] arr ={{15,27,35,42} ,{12,14,16,21},{10,25,55,67},{23,33,41,43}};
		printTheRange(arr);
	}
	
	public static void printTheRange(int[][] arr){
		
		PriorityQueue<MinHeap> minHeap = new PriorityQueue<MinHeap>();
		int max =Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++){
			
			max = Math.max(max, arr[i][0]);
			minHeap.add(new MinHeap(arr[i][0] ,i , 0));
		}
		
		int range = max-minHeap.peek().data;
		
		while(minHeap.peek().columnIndex<arr[0].length){
		
			MinHeap element = minHeap.poll();
			if(max-element.data<range){
				range = max-element.data;
			}
			int colIndex = element.columnIndex+1;
			if(colIndex<arr[0].length){
			max = Math.max(arr[element.rowIndex][colIndex], max);
			minHeap.add(new MinHeap(arr[element.rowIndex][colIndex] ,element.rowIndex, colIndex));
			}else{
				break;
			}
		}
		
		System.out.println(range);
	}

}
