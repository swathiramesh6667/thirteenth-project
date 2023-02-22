package com.Aggregation;

import java.util.Scanner;

public class Aggregation3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fname=sc.next();
		System.out.println("Enter Middle Name: ");
		String mname=sc.next();
		System.out.println("Enter Last Name: ");
		String lname=sc.next();
		System.out.println("Contact Number: ");
		String contact=sc.next();
		System.out.println("Enter Department: ");
		String department=sc.next();
		System.out.println("Enter Basipay: ");
		int basicpay=sc.nextInt();
		System.out.println("Enter EntertainmentAllowance: ");
		int entertainmentAllowance=sc.nextInt();
		System.out.println("Enter Incentive: ");
		int incentive=sc.nextInt();
		
		EmpName en=new EmpName(fname,mname,lname);
		Salary salary=new Salary(basicpay,entertainmentAllowance,incentive);
		EmpDetails empDetails=new EmpDetails(salary,contact,department,en);
	    empDetails.display(); 
	    
	    sc.close();
	}

}
class Salary
{
	int basicpay,EntertainmentAllowance,Incentive;

	public Salary(int basicpay, int entertainmentAllowance, int incentive) {
		super();
		this.basicpay = basicpay;
		EntertainmentAllowance = entertainmentAllowance;
		Incentive = incentive;
	}
}
class EmpName
{
	String fname,mname,lname;

	public EmpName(String fname, String mname, String lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}
}
class EmpDetails
{
	Salary salary;
	String contact,department;
	EmpName empname;
	public EmpDetails(Salary salary, String contact, String department, EmpName empname) {
		super();
		this.salary = salary;
		this.contact = contact;
		this.department = department;
		this.empname = empname;
	}
	void display()
	{
		System.out.println("Name: "+empname.fname+" "+empname.mname+" "+empname.lname);
		System.out.println("Contact: "+contact);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary.basicpay+" "+salary.EntertainmentAllowance+" "+salary.Incentive);
	}
}