package Classanobjects;

public class car2 {
	int id,price;
	String name,company;
	
	car2()  //default constructor
	{
		id=-1;
		name="name";
		company="company";
		price=-1;
	}
	
	car2(int id,String name,String company,int price)  //parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+company+" "+price;
	}

}
