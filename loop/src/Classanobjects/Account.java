package Classanobjects;

public class Account {
	
	private int acno;
	protected String name;
	private float balance;
	
	public void openAccount()
	{
		fillCustomerDetails(123,"vikya" ,17000); //nestedmethod
	}
	private void fillCustomerDetails(int ano,String n, float b)
	{
		acno= ano;
		name=n;
		balance=b;
	}
	void showAccountDetails() {
		System.out.println("customer name :"+name);
		System.out.println("Account no:"+acno);
		System.out.println("Account Balance id rs."+balance);
	}

}

