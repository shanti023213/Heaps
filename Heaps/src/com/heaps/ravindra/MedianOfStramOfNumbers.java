package com.heaps.ravindra;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStramOfNumbers {
	
	
	static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());//lower half
    static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();//higher half

	public static void main(String[] args) {
		int[] arr = {5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4};
		findMedian1(arr);
		//System.out.println(findMedian2(arr));

	}

	public static void findMedian1(int[] arr){

		
		maxHeap.add(arr[0]);
		
		for(int i=1;i<arr.length;i++){
				if(arr[i] <maxHeap.peek()){
					maxHeap.add(arr[i]);
				}else{
					minHeap.add(arr[i]);
				}
				if(Math.abs(maxHeap.size()-minHeap.size())>1){
					if(maxHeap.size()>minHeap.size()){
						minHeap.add(maxHeap.poll());
					}else{
						maxHeap.add(minHeap.poll());
					}
				}
		}
		
		if(maxHeap.size()>minHeap.size()){
			System.out.println("Median" + maxHeap.peek());
		}else if(maxHeap.size()<minHeap.size()){
			System.out.println("Median" + minHeap.peek());
		}else{
			double median = (double)(maxHeap.peek()+minHeap.peek())/2;
			 System.out.println("Median" + median);
		}
	}
	
	
	public static double findMedian2 (int[] arr){
		for(int i=0;i<arr.length;i++){
			
			addNum(arr[i]);
		}
 
		return findMedian();
}
	
	   // Returns the median of current data stream
    public static double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (double)(maxHeap.peek()+(minHeap.peek()))/2;
        }else{
            return maxHeap.peek();
        }
    }
    

    
    
    // Adds a number into the data structure.
    public static void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
 
        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    
	public static void findMedian3(int[] arr){

		
		for(int i=0;i<arr.length;i++){
					maxHeap.add(arr[i]);
					minHeap.add(maxHeap.poll());
				
				if(maxHeap.size() <minHeap.size()){
					maxHeap.add(minHeap.poll());
				}
		}
		
		if(maxHeap.size()==minHeap.size()){
		
			double median = (double)(maxHeap.peek()+minHeap.peek())/2;
			 System.out.println("Median" + median);
		}else{
			 System.out.println("Median" + maxHeap.peek());
		}
	}
}
