package com.heaps.ravindra;

import java.util.ArrayList;

class Is_BinaryTree_MaxHeap
	{     
	    // driver function to test the above functions
	    public static void main(String args[])
	    {
	        Is_BinaryTree_MaxHeap bt = new Is_BinaryTree_MaxHeap();
	         
	        Node root = new Node(20);
	        root.left = new Node(19);
	        root.right = new Node(18);
	        root.left.left = new Node(17);
	        root.left.right = new Node(16);
	        root.right.left = new Node(15);
	        root.right.right = new Node(14);
	        root.left.left.left = new Node(13);
	        root.left.left.right = new Node(12);
	        root.left.right.left = new Node(11);
	        root.left.right.right = new Node(10);
	        root.right.left.left = new Node(9);
	        root.right.left.right = new Node(8);
	        root.right.right.right = new Node(7);
	        root.right.right.left = new Node(6);
	        root.left.left.left.left = new Node(5);
	 
	        if(isHeap(root) == true)
	            System.out.println("Given binary tree is a Heap");
	        else
	            System.out.println("Given binary tree is not a Heap");
	    }
	    
	    public static boolean isHeap(Node n){
	    	if(n==null){
	    		return true;
	    	}
	    	else{
	    		int noOfNodes = NoOfNodes(n);
	    		return (isIndexCheck(n,0,noOfNodes) && maxHeapProperty(n));
	    	}
	    }
	    
	    public static boolean isIndexCheck(Node n,int index, int noOfNodes){
	    	
	    	if(n==null){
	    		return true;
	    	}
	    	if(index>=noOfNodes){
	    		return false;
	    		
	    	}
	    	return isIndexCheck(n.left,2*index+1,noOfNodes) &&  isIndexCheck(n.right,2*index+2,noOfNodes);
	    			
	    	
	    }
	    public static int NoOfNodes(Node n){
	    	if(n==null){
	    		return 0;
	    	}
	    	return 1+NoOfNodes(n.left)+NoOfNodes(n.right);
	    }
	    
	    public static boolean maxHeapProperty(Node node)
	    {
	    
	    	if(node==null){
	    		return true;
	    	}
	    	
	    	if(node.left ==null && node.right==null){
	    		return true;
	    	}
	    	
	    	if(node.right==null){
	    		return node.data>node.left.data;
	    	}else{
	    		
	    		if(node.data>node.left.data && node.data> node.right.data ){
	    			return maxHeapProperty(node.left)&& maxHeapProperty(node.right);
	    	}
	    	return false;
	    	
	    }
	}
	
	}
