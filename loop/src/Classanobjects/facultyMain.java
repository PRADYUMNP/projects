package Classanobjects;

import java.util.Scanner;

public class facultyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc= new Scanner(System.in);
		
		System.out.println("enter id,name,subject,college,salary of the faculty: ");
		int id =sc.nextInt();
		String name=sc.next();
		String subject=sc.next();
		String college=sc.next();
		int salary=sc.nextInt();
		
		faculty c1=new faculty(id,name,subject,college,salary);
		

	}

}
