package Session2.Assignment5;

import java.util.Scanner;
//THIS JAVA FILE ANSWER QUESTION 2 for Session 2 assignment 5
public class StringClass {

	public static void main(String[] args) {

		String S1 = "";
		String S2 = "";

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your First String: ");
		S1 = sc.next();
		System.out.print("Enter your Second String: ");
		S2 = sc.next();
		
		
		//Reverse String

		String reverse = "";
		int sl = S2.length();

		for (int i = sl -1 ; i >= 0; i--) 
		{
			reverse = reverse + S2.charAt(i);
		}
		System.out.println();
		System.out.println("Your reverse String is " + reverse);
		System.out.println();
		
		//IF S1 is equal to S2
		if(S1.equals(S2)) {
			System.out.println("Both Strings are EQUAL");
		}
		else {
			System.out.println("Strings are not equal");
		}
		
	
	
	}

}

