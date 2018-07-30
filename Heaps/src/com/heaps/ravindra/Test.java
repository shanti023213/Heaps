package com.heaps.ravindra;

public class Test {

	public static void main(String[] args) {
		
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
	        
	        System.out.println("IsMaxHeap" + isMaxHeap(root));

	}

	public static boolean isMaxHeap(Node node){
		if(node == null){
			return true;
		}
		
		int noOfNodes = noOfNodes(node);
		return indexCheck(node, 0 ,noOfNodes) && heapPropertyCheck(node);
	}
	
	public static boolean indexCheck(Node node, int index, int noOfNodes){
		
		if(node==null){
			return true;
		} 
		
		
		if(noOfNodes>index){
			return indexCheck(node.left, 2*index+1,noOfNodes) && indexCheck(node.right,2*index+2,noOfNodes);
		}else{
			return false;
		}
	}
	
	public static boolean heapPropertyCheck(Node node){
		if(node == null || (node.left ==null && node.right==null)){
			return true;
		}
		
		if(node.left ==null){
			return heapPropertyCheck(node.right);
		}else if(node.right ==null){
			return heapPropertyCheck(node.left);
		}else if(node.left.data<node.data && node.right.data<node.data){
			return heapPropertyCheck(node.left) && heapPropertyCheck(node.right);
		}else{
			return false;
		}
		
	}
	
	
	public static int noOfNodes(Node node){
		if(node==null){
			return 0;
		}
		return 1+noOfNodes(node.left)+noOfNodes(node.right);
	}
}
