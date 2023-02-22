package com.Aggregation;

public class Aggregation2 {

	public static void main(String[] args) 
	{
        StudentName studentname=new StudentName("Swathi","Ramesh","R");
        StudentDetails sd=new StudentDetails(studentname);
        sd.display();
	}

}

class StudentName
{
	String fname,mname,lname;

	public StudentName(String fname, String mname, String lname) 
	{
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}	
}

class StudentDetails
{
	StudentName studentname;//Aggregation

	public StudentDetails(StudentName studentname) 
	{
		super();
		this.studentname = studentname;
	}
	
	void display() 
	{
	System.out.println(studentname.fname+" "+studentname.mname+" "+studentname.lname);	
	}
}












