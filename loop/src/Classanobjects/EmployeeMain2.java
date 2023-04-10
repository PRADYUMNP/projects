package Classanobjects;
import java.util.Scanner;

public class EmployeeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =new Employee();
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the id,name,contact,dept,Salary: ");
		int i= sc.nextInt();
		String n=sc.next();
		String c=sc.next();
		String d=sc.next();
		double s=sc.nextDouble();
		
		e1.SetData();
		
		Employee e2 = new Employee();
		System.out.println("enter the id,name,contact,dept,Salary: ");
		i=sc.nextInt();
		n=sc.next();
		c=sc.next();
		d=sc.next();
		s=sc.nextDouble();
		

	}

}
