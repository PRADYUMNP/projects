package Containment;

public class carconstructor {
	int id,number;
	String name;
	
	carconstructor(){}
	
	carconstructor(int id,int number,String name)
	{
		this.id=id;
		this.name=name;
		this.number=number;
	}
	
	public String toString()
	{
		return id+" "+number+" "+name;
		
	}

}
