package com.nestedClass;

public class NestedClass1 
{
    //member class
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.display();
		
		A.B b1=a1.new B();
		b1.show();
		
	    A.C c1=a1.new C();
	    c1.disp();
	    
	    A.B.D d1=b1.new D();
	    d1.call();
		

	}

}

class A
{
	private int a=10;

	class B
	{

		class D
		{
			void call()
			{
				System.out.println("Another inner class leval increase");
			}
		}

		void show()
		{
			System.out.println("Inner class");
			System.out.println(a);
		}
	}

	class C
	{

		void disp()
		{
			System.out.println("Another Inner Class");
		}
	}

	void display()
	{
		System.out.println("Outer Class");
	}

}