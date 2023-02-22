package com.practice;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{

		char Alphabet;

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Alphabet: ");

		Alphabet = scanner.next().charAt(0);

		switch(Alphabet)

		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':

			System.out.println("Alphabet is vowel");
			break;

		default:
			System.out.println("Alphabet is constant");

			scanner.close();


		}


	}

}
