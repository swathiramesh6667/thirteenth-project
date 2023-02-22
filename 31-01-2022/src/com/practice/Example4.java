package com.practice;

import java.util.Scanner;

public abstract class Example4 {

	public static void main(String[] args) 
	{
        int i;
        
     Scanner scanner = new Scanner (System.in);
     
     System.out.println("Enter Number");
     
     i=scanner.nextInt();
     
     if(i % 2==0)
     {
    	 System.out.println("Number is even");
     }
     else
     {
    	 System.out.println("Number is odd");
     }
     scanner.close();
	}

}
