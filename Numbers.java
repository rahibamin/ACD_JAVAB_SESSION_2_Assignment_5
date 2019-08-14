package Session2.Assignment5;

import java.util.Scanner;
// THIS JAVA FILE ANSWER QUESTION 3 - 7 for Session 2 assignment 5
public class Numbers {

	public static void main(String[] args) {

		int numlimit = 0, s=0;
		Scanner sc = new Scanner(System.in);


		System.out.print("Enter the number (N): ");
		numlimit =  sc.nextInt();
		System.out.print("Enter the number where you want to Start (S): ");
		s =  sc.nextInt();
		
		System.out.println();
		System.out.println("Even Numbers");
		System.out.println("Printing EVEN numbers between 1 and " + numlimit);
		for(int i=s; i <= numlimit*2 +s -1 ; i++){
			// if the number is divisible by 2 then it is even
			if( i % 2 == 0){
				System.out.print(i + " ");
			}

		}

		System.out.println();
		System.out.println();
		System.out.println("ODD Numbers");
		System.out.println("Printing ODD numbers between 1 and " + numlimit);

		for(int i=s; i <= numlimit*2 -1 + s; i++){


			// if the number is divisible by 2 then it is even
			if( i % 2 != 0){
				System.out.print(i + " ");
			}


		}

		int pm=0,spaces=0;      
		int n=0;
		System.out.println();
		System.out.println();
		System.out.println("PrimeNumber");
		System.out.print("Enter the PrimeNumber (N): ");
		n =  sc.nextInt();

		pm=n/2;      
		if(n==0||n==1)
		{  
			System.out.println(n+" is not a prime number");      
		}
		else
		{  
			for(int i=2;i<=pm;i++)
			{      
				if(n%i==0){      
					System.out.println(n+" is not a prime number");      
					spaces=1;      
					break;      
				}      
			}      
			if(spaces==0)  
			{ System.out.println(n+" is a prime number"); }  
		}

		System.out.println();
		System.out.println("Palindrome");
		int reminder,sum=0,tempNum;
		int palindromeNum;
		System.out.print("Please enter a Palindrome Number: ");
		palindromeNum = sc.nextInt();	

		int temp = palindromeNum;
		tempNum = palindromeNum;

		while(palindromeNum > 0){    
			reminder= palindromeNum % 10;
			sum=(sum * 10) +reminder;    	
			palindromeNum= palindromeNum/10;  
		}    
		if(tempNum==sum) 
		{   	
			System.out.println(temp + " is a Palindrome number ");  
		}
		else    

		{
			System.out.println(temp + " is not a Palindrome number ");   
		}

		System.out.println();
		System.out.println();
		System.out.println("Armstrong");

		int calculate=0,armstrong,temparmstrong;  
		int armstrongn; 
		System.out.print("Enter the PrimeNumber (N): ");
		armstrongn =  sc.nextInt();
		int assigntemparmstrong = armstrongn;

		temparmstrong=armstrongn;  
		while(armstrongn>0)  
		{  
			armstrong=n%10;  
			armstrongn=armstrongn/10;  
			calculate=calculate+(armstrong*armstrong*armstrong);  
		}  
		if(temparmstrong==calculate)  
		{
			System.out.println(assigntemparmstrong +" is an Armstrong Number."); 
		}
		else  {
			System.out.println(assigntemparmstrong +" is Not an Armstrong Number.");   
		}

	}  
}

