package getterAndsetterMethod;

public class GooglePayApp {
	
	public void transferAmount(int amount, Account ac1)
	{
		System.out.println("transaction in process...");
		float ba1=ac1.getBalance();
		//ac1.SetBalance(ac1.getBalance()-amount);
		ac1.SetBalance(ba1-amount);
		System.out.println("Amount transferd successfully" 
		+"\nUpdated balance of Account no"+ac1.getAcno()
		+"is Rs."+ac1.getBalance());
	}

	public static void main(String[]args)
	{
		Account obj= new Account();
		obj.accptAccountDetails(123, "vikya", 70000);
		
		GooglePayApp t1 =new GooglePayApp();
		t1.transferAmount(5000, obj);
	}
}
