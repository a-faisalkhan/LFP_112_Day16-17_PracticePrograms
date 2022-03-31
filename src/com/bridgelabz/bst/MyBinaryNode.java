package com.bridgelabz.bst;

public class MyBinaryNode<K extends Comparable<K>> {

	public K key;
	public MyBinaryNode<K> left;
	public MyBinaryNode<K> right;

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		if (left != null) {
			str.append("Node{Key=" + left.key + "}<=");
		}
		str.append("Node{Key=" + key + "}");
		if (right != null) {
			str.append("=>Node{Key=" + right.key + "}");
		}
		return str.toString();
	}
}