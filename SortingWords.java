// Jeffrey Williams
// COP 3330 Object Oriented Programming
/* (Sorting Words with a TreeSet) Write a program that uses a 
 * String method split to tokenize a line of text input by the 
 * user and places each token in a Treeset. Print the elements 
 * of the TreeSet. [Note: This should cause the elements to be 
 * printed in ascending sorted order.]*/

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;

public class SortingWords 
{
	public static void main(String[] args)
	{
		// create TreeSet from user input
		String sentence = null;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the words you wish to be sorted (must be letters and lowercase): ");
		sentence = input.nextLine();
		String[] words = sentence.split("\\s+");

		// sorting the string array in ascending order
		SortedSet<String> tree = new TreeSet<>(Arrays.asList(words));

		// printing the sorted tree by calling printSet
		System.out.print("sorted set: ");
		printSet(tree);
		
		// get first and last elements
		System.out.printf("first: %s%n", tree.first());
		System.out.printf("last : %s%n", tree.last());
	} // end main

	// output SortedSet using enhanced for statement
	private static void printSet(SortedSet<String> set)
	{
		for (String s : set)
			System.out.printf("%s ", s);
		
		System.out.println();
	} // end printSet
} // end class SortingWords