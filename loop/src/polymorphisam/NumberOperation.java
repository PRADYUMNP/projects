package polymorphisam;

public class NumberOperation {
	public void addnumbers(int x,int y, float z)
	{
		System.out.println("Addition of number is : "+(x+y+z));
	}
	public int addnumbers(int x, int y)
	{
		return x+y;
	}
	
	public void addnumbers(int y, float z)
	{
		System.out.println("Addition of number is : "+(y+z));
	}

}
