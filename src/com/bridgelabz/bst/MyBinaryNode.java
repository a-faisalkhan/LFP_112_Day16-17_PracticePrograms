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
		StringBuilder builder = new StringBuilder();
		builder.append("MyBinaryNode{key=" + key + "}");

		if (left != null) {
			builder.insert(0, "MyBinaryNode{key=" + left.key
					+ "}<--");
		}
		if (right != null) {
			builder.append("-->MyBinaryNode{key="
					+ right.key + "}");
		}

		return builder.toString();
	}
}