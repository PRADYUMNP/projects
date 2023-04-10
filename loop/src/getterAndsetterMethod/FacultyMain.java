package getterAndsetterMethod;

import java.util.Scanner;


public class FacultyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
			
			System.out.println("enter id,name,subject,contact,salary of the faculty: ");
			int id=sc.nextInt();
			int salary=sc.nextInt();
			String name=sc.next();
			String contact=sc.next();
			String subject=sc.next();
			
			Faculty f1 = new Faculty();
			f1.setId(id);
			f1.setSalary(salary);
			f1.setName(name);
			f1.setContact(contact);
			f1.setSubject(subject);
			
			System.out.println(f1.getId()+" "+f1.getName()+" "+f1.getSalary()+" "+f1.getContact());
			


	}

}
