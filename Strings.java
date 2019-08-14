package Session2.Assignment5;

import java.util.Scanner;

//THIS JAVA FILE ANSWER QUESTION 8 & 9 for Session 2 assignment 5

public class Strings {
	
	public static void main(String [] args){
		System.out.println("Removing any repeated character in a String");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a String: ");
		String str = sc.nextLine();
		String userString="";
		int j = 0;
		for (int i=0; i<str.length()-1 ; i++){
			j = i+1;
			if(str.charAt(i)!=str.charAt(j)){
				userString+=str.charAt(i);
			}
		}
		System.out.println("Your new string is " + userString);


		System.out.println();
		System.out.println("Print all the combinations of characters entered");
		String str1;
		System.out.print("Please enter a String: ");
		str1=sc.next();
		permutation("",str1);
	}
	public static void permutation(String fixed,String sub)
	{
		if(sub.equals(""))
		{
			System.out.println(fixed);
		}
		else
		{
			int a[] = new int[256];
			for(int i=0;i<sub.length();i++)
			{
				if(a[(int)sub.charAt(i)]==0)
				{
					a[(int)sub.charAt(i)]=1;
					permutation((fixed+sub.charAt(i)),sub.substring(0,i)+sub.substring(i+1,sub.length()));
				}
			}
		}

	}
}
