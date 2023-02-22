package com.practice;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		
		 int a;
		 
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.println("Enter the Number");
		 
		 a=scanner.nextInt();
		 
		 if(a>0)
		 {
			 System.out.println("The Number is Positive");
		 }
		 else if (a<0)
		 {
			 System.out.println("The Number is Negative");
		 }
		 else
		 {
			 System.out.println("THE Number is Zero");
		 }
		 
		scanner.close();
	}
	

}
