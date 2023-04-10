package Classanobjects;

public class student1 {
	
	int id,marks;
	String name,dept;
	static String colgname="jspm";
	
	student1(int id, String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	
	}
	
	static void displaycolgname()
	{
		System.out.println(colgname);
	}
	
	void displayData()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks);
	}

}
