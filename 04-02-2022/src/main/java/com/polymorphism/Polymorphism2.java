package com.polymorphism;

public class Polymorphism2 {

	public static void main(String[] args) 
	{
     MyClass myclass=new MyClass();
     MyClass myclass1=new MyClass(12,23);
     MyClass myclass2=new MyClass(10);
     MyClass myclass3=new MyClass(89.3);
     MyClass myclass4=new MyClass(67.8f);
     
	}

}

//constructor overloading
//static polymorphism

class MyClass
{
	//multiple forms of constructor
	//by changing the either parameter type or parameter count
	MyClass()
	{
		System.out.println("Hello User!");
	}
	MyClass(int a)
	{
		System.out.println("The value of the int parameter is "+a);
	}
	MyClass(float a)
	{
		System.out.println("The value of float parameter is "+a);
	}
	MyClass(int a,int b)
	{
		System.out.println((a+b));
	}
	MyClass(double a)
	{
		System.out.println("The value  of double parameter is "+a);
	}
}