package Classanobjects;

import java.util.Scanner;

public class Employee {

	// TODO Auto-generated method stub
	int id;
	String name, dept, contact;
	double Salary;

	void SetData() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the id,name,contact,dept,Salary: ");
			int i = sc.nextInt();
			String n = sc.next();
			String c = sc.next();
			String d = sc.next();
			double s = sc.nextDouble();

			id = i;
			name = n;
			contact = c;
			dept = d;
			Salary = s;
		}

	}

	void display() {
		System.out.println(id+" "+name+" "+contact+" "+dept+" "+Salary);
	}
}
