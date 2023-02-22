package com.aggregation;

public class Example {

	public static void main(String[] args) 
	{
         Salary sn=new Salary(System.in);
         
	}

}

class Salary
{
	int basicpay;
	int entertainmentAllowance;
	int incentive;
	
	public Salary(int basicpay, int entertainmentAllowance, int incentive) 
	{
		super();
		this.basicpay = basicpay;
		this.entertainmentAllowance = entertainmentAllowance;
		this.incentive = incentive;
	}
}
class EmpName
{
	String fName,mName,lName;

	public EmpName(String fName, String mName, String lName) 
	{
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}
	
}
class Empdetails
{
	EmpName empname;
	String contact,department;
	Salary salary;
	
	public Empdetails(EmpName empname, String contact, String department, Salary salary) {
		super();
		this.empname = empname;
		this.contact = contact;
		this.department = department;
		this.salary = salary;
	}

	void display()
	{
		//method should able to provide details about empname,contact and salary
		//salary addition of basicpay+entertainmentAllowance+incentive
		System.out.println("");
	}
}
