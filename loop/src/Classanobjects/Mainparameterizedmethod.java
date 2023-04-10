package Classanobjects;
import java.util.Scanner;

public class Mainparameterizedmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter two integer number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
				
		parameterizedmethod pm1 = new parameterizedmethod();
		
		pm1.add(100, 500);

parameterizedmethod pm2 = new parameterizedmethod();
		
		pm2.multiply(100, 500);
		

parameterizedmethod pm3 = new parameterizedmethod();
		
		pm2.divide(550, 0);
		
		

	}

}
