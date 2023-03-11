package Scenarios;

import java.util.Scanner;

public class Palindrome {
	
	public static void palindrome(String str ) {
		
		String reverseString = "";
		
		for (int i =str.length()-1; i>=0; i--) {
			reverseString +=str.charAt(i);	
		}
		if(str.equals(reverseString))
			System.out.println("Palindrome");
		else
			System.out.println("Palindrome deðil");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		palindrome(str);
		
	}

}
