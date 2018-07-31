/*
 * Preston McIllece and Vicky Wang's Lab6
 * 
 * This program takes an integer input and determines whether the binary
 * value of that integer is a palindrome or not.
 */

import java.util.Scanner;
 

public class IsBinaryPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message;
		int messageInt;
		String finalString;
		

		do {
			System.out.println("Enter an integer:");

			message = scan.nextLine();
			messageInt = Integer.parseInt(message); //String to int
			finalString = Integer.toBinaryString(messageInt); //int to binary version of int
															// represented as a String

			/**
			 * Now determine if message is a palindrome or not
			 */
			System.out.println(PalindromeChecker.symmetric(finalString));
		}
		while (message.length() != 0); 
			
		
		scan.close();
	}

	}

