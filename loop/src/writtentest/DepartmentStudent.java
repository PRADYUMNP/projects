package writtentest;

public class DepartmentStudent {
	int id;
	String name;
	
	DepartmentStudent(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public class student{
		int roll;
		String name,  department;
		
		student(int roll, String name, String department)
		{
			this.roll=roll;
			this.name=name;
			this.department=department;
		}
	}

}
