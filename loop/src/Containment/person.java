package Containment;

public class person {
	int id;
	String name,contact;
	Address add;
	
	person (int id ,String name, String contact, Address add)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.add=add;
	}
	
	public String toString()
	{
		return id+" "+name+" "+contact+" "+add;
	}

}
