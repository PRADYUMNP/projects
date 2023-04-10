package Classanobjects;
import java.util.Scanner;
public class parameterizedmethod {
	
	void add(int a,int b) {
		System.out.println("addition is: "+(a+b));
	}
	
	void multiply(int a, int b) {
		System.out.println("multiplication is: " +(a*b));
	}
	
	void divide(int a, int b) { 
		
		Scanner sc=new Scanner(System.in);
		while(b==0 || b<0) { 
			System.out.println("enter a valid zero positive number :");
			b=sc.nextInt();
			
		}
		System.out.println("divide is: "+(a/b));
	}

}
