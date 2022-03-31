package com.bridgelabz.bst;

public class BinarySearchTree<K extends Comparable<K>> {

	MyBinaryNode<K> root;
	
	public boolean add(MyBinaryNode<K> node) {
		if(root == null) {
			root = node;
		} else {
			if (root.key.compareTo(node.key) > 0) {
				root.left = node;
			} else {
				root.right = node;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return root.toString();
	}
}