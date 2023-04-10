package Containment;

public class Addressgetset {
	String city,state,country;
	persongetset add;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}
	public persongetset getAdd() {
		return add;
	}
	public void setAdd(persongetset add) {
		this.add = add;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String toString()
	{
		return city+" "+state+" "+country;
	}
	
	

}
