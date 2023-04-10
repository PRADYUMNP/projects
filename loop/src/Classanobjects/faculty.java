package Classanobjects;

public class faculty {
	
	int id;
	String name, subject,college;
	int salary;
	
	faculty(int id, String name, String subject, String college,int salary)  //parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.subject=subject;
		this.college=college;
		this.salary=salary;
		
	}
	public String toString()
	{
		return id+" "+name+" "+subject+" "+college+" "+salary;
	}
}

