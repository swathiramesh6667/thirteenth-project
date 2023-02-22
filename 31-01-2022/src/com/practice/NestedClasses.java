package com.practice;

public class NestedClasses {

	public static void main(String[] args) 
	{
        o1.I1.show();
	}

}
class o1
{
	static class I1
	{
		static void show()
		{
			System.out.println("definition of show method");
		}
	}
	
}