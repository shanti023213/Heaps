package com.heaps.ravindra;

import java.util.ArrayList;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data = data;
	}
}
public class BSTToMaxHeap {

	public static void main(String[] args) {
		Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

	        ArrayList<Integer> list = new ArrayList<Integer>();
	        bstToMaxHeap(root,list);
	        
	        System.out.println("******");
	}
	
	public static void bstToMaxHeap(Node node,ArrayList<Integer>list){
		if(node== null){
			return ;
		}
		
		bstToMaxHeap(node.right,list);
		list.add(node.data);
		bstToMaxHeap(node.left,list);
	}

}
