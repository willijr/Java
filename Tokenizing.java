// Jeffrey Williams
// COP 3330 Object oriented programming
// Project 9
/* 14.13 (Tokenizing and Comparing Strings) Write an application that reads a 
line of text, tokenizes the line using space characters as delimiters and outputs 
only those words beginning with the letter "b". */

import java.util.Scanner;

public class Tokenizing {

	public static void main(String[] args) 
	{
		String sentence = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to enter text or use default. \n1 to enter. \n2 for default\n");
		int x = input.nextInt();
		
		// get sentence
		if (x == 1)
		{
			System.out.println("Enter a sentence and press Enter");
			sentence = input.nextLine();
		}
		else if (x == 2)
			sentence = "I've been here before after we put together the bed. " + 
				"because my best bar sells me great drinks after working in the barn all day." + 
				"it brought good times when i drink beer i head back.";
		else
			System.out.println("This is not one of the options. Please try again later.");
		
		String[] tokens = sentence.split(" ");
		for (int i = 0; i < tokens.length; i++)
			if (tokens[i].charAt(0) == 'b' || tokens[i].charAt(0) == 'B')
				System.out.printf("%s %s", tokens[i], " ");
	}

}
