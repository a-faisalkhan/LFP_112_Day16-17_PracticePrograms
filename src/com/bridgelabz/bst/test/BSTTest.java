package com.bridgelabz.bst.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.bst.BinarySearchTree;
import com.bridgelabz.bst.MyBinaryNode;

public class BSTTest {

	@Test
	public void addThreeNodeToBST() {

		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(45);
		bst.add(22);
		bst.add(65);
		bst.add(34);
		bst.add(23);
		bst.add(54);
		bst.add(33);

		System.out.println(bst);
		
		assertTrue(bst.search(45));
		assertFalse(bst.search(21));
		assertTrue(bst.search(65));
		assertFalse(bst.search(99));
		assertTrue(bst.search(33));
	}

}