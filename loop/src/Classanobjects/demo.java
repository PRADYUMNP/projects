package Classanobjects;

public class demo {
	int a=100;
	static int b=1000;
	
	
	void display() {
		System.out.println(a+" "+b);
	}
	
	static void show()
	{
		System.out.println(b);
		demo d=new demo();
		System.out.println(d.a);
	}
	public static void main(String[]args) {
		
	}


}
