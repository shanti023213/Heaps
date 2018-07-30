package com.heaps.ravindra;

public class BuildMaxHeap {

	public static void main(String[] args) {
		int[] arr = {1,5,6,8,12,14,16};
		
		//1. Build Heap
		buildMaxHeap(arr);
		
		//2. Print Max
		System.out.println("Max:" +arr[0] );
		
		// 3. Extract Max
		//int max = extractMax(arr);
		//System.out.println(max);
		
		// 4. Increase Key
		increaseKey(arr, 1,100);
		System.out.println("Max:" +arr[0] );
		
		
		
	}
	
	public static void buildMaxHeap(int[] arr){
			
		int  heapSize = arr.length;
		for(int i=(heapSize/2)-1;i>=0;i--){
			maxHeapify(arr,i, heapSize);
			
		}
	
	}
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
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
	
	public static int extractMax(int[] arr){
		
		int max = arr[0];
		arr[0] = arr[arr.length-1];
		int heapSize = arr.length-1;
		maxHeapify(arr,0,heapSize);
		
		return max;
	}
	
	public static void increaseKey(int[] arr, int index, int value){
		arr[index] = value;
		
		int i = index;
		while(i/2>=0 && arr[i] > arr[i/2] ){
				int temp =arr[i/2];
				arr[i/2] =arr[i];
				arr[i]=temp;
			
		}
		
	}

}
