package com.heaps.ravindra;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {100,20,30,10,15,7,16};
		heapSort(arr);
		System.out.println("*********");
	}
	
	public static void heapSort(int[] arr){
		
		buildMaxHeap(arr);
		int heapSize = arr.length;
		
		while(heapSize>1){
			
			swap(arr ,0,heapSize-1);
			heapSize--;
			maxHeapify(arr,0,heapSize);
		}
	}
	
	
	public static void swap(int[] arr, int source, int target){
		int temp = arr[target];
		arr[target]= arr[source];
		arr[source]=temp;
	}
	
	public static void maxHeapify(int[] arr, int i, int heapSize){
		
		int left = 2*i+1;
		int right = 2*i+2;
		int max = i;
		if(left<heapSize && arr[left] >arr[max]){
			max = left;
		}
		if(right<heapSize && arr[right]>arr[max]){
			max =right;
		}
		if(max!=i){
			int temp = arr[i];
			arr[i]= arr[max];
			arr[max]=temp;
			maxHeapify(arr,max,heapSize);
		}
	}
	
	public static void buildMaxHeap(int[] arr){
		
		int  heapSize = arr.length;
		for(int i=(heapSize/2)-1;i>=0;i--){
			maxHeapify(arr,i, heapSize);
			
		}
	
	}

}
