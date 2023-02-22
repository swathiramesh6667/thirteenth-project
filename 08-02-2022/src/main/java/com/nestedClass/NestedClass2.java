package com.nestedClass;

public class NestedClass2 {

	public static void main(String[] args) 
	{
         Outer outer=new Outer();
         
         Outer.Inner inner=outer.new Inner();
         inner.show();
         
         Outer.Inner.SubInner subinner=inner.new SubInner();
         subinner.display();
         
         
	}

}

class Outer
{
	class Inner
	{
		class SubInner
		{
			void display()
			{
				System.out.println("Calling SubInner Class Method");
			}
		}
		void show()
		{
			System.out.println("Calling Inner Class Method");
		}
	}
}