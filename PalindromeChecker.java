/**
 * Preston McIllece and Vicky Wang's Lab6
 * 
 * This program reports whether the user's input is a palindrome or not.
 */

import java.util.Scanner;

public class PalindromeChecker
{
	//method that determines if it's a palindrome
	public static String symmetric(String word) {
		Stack s1 = new ListStack();
		Stack s2 = new ArrayStack();
		boolean check = true;
		
		//adding characters of input to a stack
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			s1.push(c);
		}
		//adding characters of input in reverse to a stack
		for (int i = word.length(); i > 0 ; i--) {
			char c = word.charAt(i - 1);
			s2.push(c);
		}
		//comparing both stacks
		for (int i = 0; i < word.length(); i++) {
			if (s1.pop() != s2.pop())
				check = false;
		}
		String returnValue = " ";
		if (check == true)
			returnValue = word + " is a palindrome!";
		else
			returnValue = word + " is not a palindrome.";
		
		return returnValue;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = null;

		do {
			System.out.println("Enter a string:");

			message = scan.nextLine();

			/**
			 * Now determine if message is a palindrome or not
			 */
			System.out.println(symmetric(message));
		}
		while (message.length() != 0); 
			
		
		scan.close();
	}
}