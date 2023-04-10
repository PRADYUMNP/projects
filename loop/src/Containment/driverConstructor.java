package Containment;

public class driverConstructor {
	int id ;
	String name,contact;
	carconstructor add;
	
	driverConstructor(int id, String name, String contact)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.add=add;
	
	}
	
	public String toString()
	{
		return id+" "+ name+" "+contact+" "+add;
	}

}
