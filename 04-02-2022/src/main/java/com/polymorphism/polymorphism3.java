package com.polymorphism;

public class polymorphism3 
{
	public static void main(String[] args) 
	{
    Add add=new Add();
    add.add(23,25);
    add.add(26, 27, 28);
    add.add(12, 23, 34, 45);
    add.add(12, 23, 34, 45, 56);
	}

}
class Add
{
	void add(double a,double b)
	{
		System.out.println((a+b));
	}
	void add(double a,double b,double c)
	{
		System.out.println((a+b+c));
	}
	void add(double a,double b,double c,double d)
	{
		System.out.println((a+d+c+d));
	}
	void add(double a,double b,double c,double d,double e)
	{
		System.out.println((a+b+c+d+e));
	}
}
/*
 * single method that must be able to add n number of values 
 * 
 */