package getterAndsetterMethod;

public class car {
	
	private int id,price,year;
	private String name,company;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getYear()
	{
		return year;
	}
	public void setName(String name)
	{
	this.name=name;	
	}
	public String getName()
	{
	     return name;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public String getCompany()
	{
		return company;
	}

}
