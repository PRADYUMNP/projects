package Classanobjects;

public class movie {
	
	int yearofrelese;
	float profit;
	String produserName,actorname;
	
	void acceptDetails()
	{
		yearofrelese =2000;
		profit= 120000.00f;
		produserName="mr.james";
		actorname="mugambo";
		
		
	}
	void showDetails() {
		System.out.println("movie profit is rs."+profit);
		System.out.println("movie produsernameis "+produserName);
		System.out.println("movie actor name is "+actorname);
		System.out.println("movie relesed in year of "+yearofrelese);
	}
	
	public static void main (String[]args)
	{
		movie titanic= new movie();
	}

}
