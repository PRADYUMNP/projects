package Assigment;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the length of the rectangle: ");
		        double length = input.nextDouble();

		        System.out.print("Enter the breadth of the rectangle: ");
		        double breadth = input.nextDouble();

		        System.out.print("Enter the unit of measurement cm,inch,meter,: ");
		        String unit = input.next();

		        double perimeter = 2 * (length + breadth);

		        switch (unit) {
		            case "cm":
		                System.out.println("The perimeter of the rectangle is " + perimeter + " " + unit + ".");
		                break;
		            case "inch":
		                System.out.println("The perimeter of the rectangle is " + perimeter + " " + unit + "es.");
		                break;
		            case "meter":
		                System.out.println("The perimeter of the rectangle is " + perimeter + " " + unit + "s.");
		                break;
		            default:
		                System.out.println("Invalid unit of measurement.");
		                break;
		        }
		    }
		


	}

