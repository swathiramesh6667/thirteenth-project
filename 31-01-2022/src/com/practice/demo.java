package com.practice;

import java.util.Scanner;

public class demo 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner (System.in);
		int a;
		int b;
		int sum;


		System.out.println("Enter first value");

		a = scanner.nextInt();

		System.out.println("Enter second value");

		b = scanner.nextInt();

		sum= a+b;

		System.out.println("Enter Sum "+sum);

		scanner.close();
	}

}
