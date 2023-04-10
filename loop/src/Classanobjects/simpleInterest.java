package Classanobjects;

public class simpleInterest {
	
	double product(int p, double r, float t)
	{
		return p*r*t;
	}
	
	void simpleInterestcal(double product)
	{
		System.out.println("simple interest is: "+(product/100));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		simpleInterest obj=new simpleInterest();
		double d=obj.product(4000, 5.5, 10);
		obj.simpleInterestcal(d);
	}

}
