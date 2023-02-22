package com.nestedClass;

public class NestedClass5 
{
	public static void main(String[] args) 
	{
		IDE ide=new IDE()//anonymous class
		{
			void display()
			{
				System.out.println("Anonymous implementation");
			}
				};
		
				ide.display();

				IDE ide1=new IDE()
				{
					void display()
					{
						System.out.println("New implementation");
					}
				};
				ide1.display();
				I1 i1=new I1()
				{
					public void show()
					{
						System.out.println("Anonymous Implementation");
					}
				};
				i1.show();
				
			I1	i2=new I1()
				{
					public void show()
					{
						System.out.println("new implementation");
					}
				};
				i2.show();

	}

}

abstract class IDE
{
	abstract void display();//declaration
}

class Child extends IDE
{
	void display()
	{
		System.out.println("Defenition to display");
	}
}
/*Anonymous : class without name 
 * to provide definitions to methods of abstract classes and interfaces
 */
interface I1
{
	void show();//public
	static void disp()
	{
		System.out.println("jk");
	}
}
class Child1 implements I1
{
	public void show()
	{
		System.out.println("definition to show");
	}
}