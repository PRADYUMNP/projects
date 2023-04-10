package Assigment;
import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);


	
		        System.out.print("Enter the number of days: ");
		        int days = input.nextInt();

		        int years = days / 365;
		        int remainingDays = days % 365;
		        int weeks = remainingDays / 7;
		        int remainingDays2 = remainingDays % 7;

		        switch (remainingDays2) {
		            case 0:
		                System.out.println(days + " days = " + years + " years, " + weeks + " weeks, and " + remainingDays2 + " days.");
		                break;
		            case 1:
		                System.out.println(days + " days = " + years + " years, " + weeks + " weeks, and " + remainingDays2 + " day.");
		                break;
		            default:
		                System.out.println(days + " days = " + years + " years, " + weeks + " weeks, and " + remainingDays2 + " days.");
		                break;
		        }
		    }
		

	}

