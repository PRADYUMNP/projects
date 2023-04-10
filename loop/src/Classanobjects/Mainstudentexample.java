package Classanobjects;
import java.util.Scanner;
public class Mainstudentexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentexample s1= new studentexample();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter id, name,email, std, marks in %:");
		int i=sc.nextInt();
		String n=sc.next();
		String e=sc.next();
		String s=sc.next();
		double m =sc.nextDouble();
		
		s1.setData(i, n, e, s, m);
		System.out.println(".....................");
		
		studentexample s2= new studentexample();
		System.out.println("enter id, name, email, std, marks in %:");
		i= sc.nextInt();
		n=sc.next();
		e=sc.next();
		s=sc.next();
		m=sc.nextDouble();
		
		s2.setData(i, n, e, s, m);
		System.out.println("...........................");
		
		studentexample s3= new studentexample();
		System.out.println("enter id, name, email, std, marks in %:");
		i= sc.nextInt();
		n=sc.next();
		e=sc.next();
		s=sc.next();
		m=sc.nextDouble();
		
		s3.setData(i, n, e, s, m);
		System.out.println("...........................");
		
		}

}
