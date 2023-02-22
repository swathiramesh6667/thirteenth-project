package com.nestedClass;


public class NestedClass3 
{
	static int a=1;
	public static void main(String[] args) 
	{
		O1.I1.show();
		O1.I1 i1=new O1.I1();
		i1.display();

	}

}
class O1
{
	static class I1
	{
		static void show()
		{
			System.out.println("definition of static method");
		}
		void display()
		{
			System.out.println("definition of non static method");
		}
	}
}