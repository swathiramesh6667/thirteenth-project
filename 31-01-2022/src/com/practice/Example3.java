package com.practice;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	{
     char ch;
     
     Scanner scanner=new Scanner(System.in);
     
     System.out.println("Enter Value");
     
     ch=scanner.next().charAt(0);
     
     if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
     {
    	 System.out.println("input is vowel");
     }
     else
     {
    	 System.out.println("input is constant");
     }
     scanner.close();
	}
}
	


