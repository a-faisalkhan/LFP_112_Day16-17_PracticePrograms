package com.bridgelabz.bst.test;

import org.junit.Test;

import com.bridgelabz.bst.BinarySearchTree;
import com.bridgelabz.bst.MyBinaryNode;

public class BSTTest {

	@Test
	public void addThreeNodeToBST() {

		MyBinaryNode<Integer> firstNode = new MyBinaryNode<Integer>(
				56);
		MyBinaryNode<Integer> secondNode = new MyBinaryNode<Integer>(
				30);
		MyBinaryNode<Integer> thirdNode = new MyBinaryNode<Integer>(
				70);
		MyBinaryNode<Integer> fourthNode = new MyBinaryNode<Integer>(
				22);

		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.add(firstNode);
		bst.add(secondNode);
		bst.add(thirdNode);
		bst.add(fourthNode);
		
		System.out.println(bst);
	}
}