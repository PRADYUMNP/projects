package Classanobjects;

public class student1Main {
	
	static int a;
	int b;
	
	static
	{
	a=300;
	System.out.println("Block 1: "+a);
	}
	
	static
	{
		System.out.println("Block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carMain.main(args);
		
		/*System.out.println("accessing variable in ststic way: " +student1.colgname);
		student1 s1= new student1(101, " vikya","comp",70);
		student1 s2=new student1(102,"onkya","comp", 60);
		
		
		student1.displaycolgname();
		s1.displayData();
		s2.displayData();*/

	}

}
