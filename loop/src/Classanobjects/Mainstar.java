package Classanobjects;
import java.util.Scanner;
public class Mainstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		/*pattern p1= new pattern();
		p1.upwardstarleftPattern();
		
		System.out.println("...............");
		
		pattern p2 =new pattern();
		p2.downwardleftstarpattern();*/
		System.out.println("1. starpyramidpattern");
		System.out.println("2. downwardleftstarpattern");
		System.out.println("3. upwardstarleftPattern");
		System.out.println("enter your choice: ");
		int ch= sc.nextInt();
		
		pattern obj= new pattern();
		
		switch(ch)
		{
		case 1:
			obj.starpyramidpattern();
			break;
			
		case 2:
			obj.downwardleftstarpattern();
			break;
			
		case 3:
			obj.upwardstarleftPattern();
			break;
			default: System.out.println("enter valid option......!!");
		
		}
	}

}
