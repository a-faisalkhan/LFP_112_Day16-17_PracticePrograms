package com.bridgelabz.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortProgram {
	
	public static void main(String[] args) {
		
		int i, j;
		Scanner sc = new Scanner(System.in);
		String[] words = new String[5];
		for (i = 0; i < 5; i++) {
			int input = i + 1;
			System.out.println("Enter the " + input + " input: ");
			words[i] = sc.next();
			
		}
		
		for (i = 0; i < words.length; i++) {
			for (j = i + 1; j < words.length; j++) {
				int differ = words[j].compareTo(words[i]);
				if (differ < 0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		System.out.println("Insertion sorted lists are:" + Arrays.toString(words));
		sc.close();
	}
}
