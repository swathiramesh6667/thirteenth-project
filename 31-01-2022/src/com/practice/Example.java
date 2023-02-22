package com.practice;

public class Example {

	private static final int Y = 0;
	public static void main(String[] args) {
   int count=1;
   while(count<=15)
   {
	   System.out.println(count%2 == 1? "***":"+++++");
	   ++count;
   }
	}

	int value[]= {1,2,3,4,5,6,7,8,9,10};
	{
	for(int i=0;i<Y;++i)
		System.out.println(value[i]);
	}	
}

