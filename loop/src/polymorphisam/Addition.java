package polymorphisam;

public class Addition {
	
	void add(int a , int b)
	{
		System.out.println("Addition of integers: "+(a+b));
	}
	void add(int a, int b, int c)
	{
		System.out.println("Addition of 3 integers: "+(a+b+c));
	}
	void add(String a, String b)
	{
		System.out.println("Addition of string: "+(a+b));
	}
	void add(int a, String b)
	{
		System.out.println("Addion of integers and String: "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a1=new Addition();
		a1.add(100, 33);
		a1.add(66, "vikya");
		a1.add("onkya", "vikya");
		a1.add(44, 44, 55);
		

	}

}
