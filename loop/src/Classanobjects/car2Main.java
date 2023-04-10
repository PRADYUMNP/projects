package Classanobjects;
import java.util.Scanner;
public class car2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	car2 c1=new car2();
	//	car2 c2=new car2();

	//	System.out.println(c1);
		//System.out.println(c2);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter id,name,company,price of the car: ");
		int id=sc.nextInt();
		String name=sc.next();
		String company=sc.next();
		int price=sc.nextInt();
		
		car2 c1=new car2(id,name,company,price);
		
		System.out.println();
		
		
		car2 c2=new car2(id,name,company,price);
		
		System.out.println();
	}

}
