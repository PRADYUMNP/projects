package getterAndsetterMethod;

public class Employee {
	
	private int id,salary;
	private String name,dept,contact;
	
	/*Employee(int id, int salary,String name, String dept, String contact)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.contact=contact;
	}*/
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public String getDept()
	{
		return dept;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	public String getContact()
	{
		return contact;
	}
	

}
