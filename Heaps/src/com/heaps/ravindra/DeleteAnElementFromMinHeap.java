package com.heaps.ravindra;

public class DeleteAnElementFromMinHeap {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		delete(arr, 5);
		printArray(arr);

	}
	
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void delete(int[] arr, int element){
		int i=0;
		for(;i<arr.length;i++){
			if(arr[i] == element){
				break;
			}
		}
		
		if(i<arr.length){
		int heapSize = arr.length-1;
		arr[i] = arr[arr.length-1];
		minHeapify(arr,i,heapSize);
		}
	}
	
	public static void minHeapify(int[] arr, int index, int heapSize){
		
		int l = 2*index+1;
		int r = 2*index+2;
		int min = index;
		
		if(l<heapSize && arr[l] <arr[min]){
			min = l;
		}
		if(r<heapSize && arr[r] <arr[min]){
			min = r;
		}
		
		if(min!=index){
			int temp = arr[index];
			arr[index] = arr[min];
			arr[min] = temp;
			minHeapify(arr,min,heapSize);
		}
	}

}
