package getterAndsetterMethod;

public class Account {
	
	private int acno;
	private String name;
	private float balance;
	
	public int getAcno()
	{
		return acno;
	}
	public String getName()
	{
		return name;
	}
	public float getBalance()
	{
		return balance;
	}
	public void SetAcno(int no)
	{
		acno= no;
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public void SetBalance(float b)
	{
		balance=b;
	}
	
	
	public void accptAccountDetails(int ano, String n, float b)
	{
		acno=ano;
		name=n;
		balance=b;
		
	}

}
