package loop;

import java.util.Scanner;

public class while_loop {
	public static void main(String[]args) {
		int s=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int end= sc.nextInt();
		
		while(s<=end)
		{
			System.out.print(s+" ");
			s++;
			
		}
		System.out.print("done");
	}
}

