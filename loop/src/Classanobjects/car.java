package Classanobjects;

public class car {
	int id;
	String name,company ;
	float price;
	double launchyear;
	
	
	void setcarData(int id, String name, String company, float price, double launchyear) {
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
		this.launchyear=launchyear;
		
		display();
	}
	
	void display() {
		System.out.println(id+" "+name+" "+company+" "+price+" "+launchyear);
	}

}
