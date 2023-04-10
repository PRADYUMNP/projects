package Classanobjects;

import java.util.Scanner;

public class pattern {
	Scanner sc= new Scanner(System.in);
	
	

	void upwardstarleftPattern()
	{
		System.out.println("enter the row number: ");
		int r=sc.nextInt();
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void downwardleftstarpattern()
	{
		System.out.println("enter the row number: ");
		int r=sc.nextInt();
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
	
	void starpyramidpattern()
	{
		
		System.out.println("enter the row number: ");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			for(int k=1;k<=r-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
}
