package com.heaps.ravindra;

public class KLargestElementsInAnArray {

	public static void main(String[] args) {
		int[] arr= {1, 23, 12, 9, 30, 2, 50};
		int k=3;
		int[] kleargestElement = klargestElements(arr,k);
		print(kleargestElement);

	}
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static int[] klargestElements(int[] arr, int k){
		
		int[] heap = new int[k];
		for(int i=0;i<k;i++){
			heap[i] =arr[i];
		}
		
		buildMinHeap(heap);
		
		
		
		for(int i=k;i<arr.length;i++){
			if(arr[i] >heap[0]){
				heap[0] =arr[i];
				minHeapify(heap,0,heap.length);
			}
		}
	
		return heap;
	
	}
	
	public static void buildMinHeap(int[] arr){
		
		int heapSize = arr.length;
		for(int i=(arr.length/2)-1;i>=0;i--){
			minHeapify(arr,i,heapSize);
		}

	}
	
	
	public static void minHeapify(int[] arr, int index, int heapSize){
		int left = 2*index+1;
		int right = 2*index+2;
		int smallest = index;
		
		if(left<heapSize && arr[left] <arr[smallest]){
			smallest = left;
		}
		
		if(right<heapSize && arr[right] <arr[smallest]){
			smallest = right;
		}
		
		if(smallest!=index){
			int temp = arr[index];
			arr[index] = arr[smallest];
			arr[smallest] =temp;
			minHeapify(arr,smallest,heapSize);
		}
	}

}
