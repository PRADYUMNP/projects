package Containment;

public class Address {
	String city, state,country;
	
	Address(){}
	
	Address(String city,String state, String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	public String toString()
	{
		return city+" "+state+" "+country;
	}

}
