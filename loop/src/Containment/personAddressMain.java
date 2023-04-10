package Containment;

public class personAddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1= new Address("pune", " maharashtra"," india");
		
		Address a2= new Address("hingoli", " maharashtra","india");
		
		person p1=new person (12,"vikya","7448000650",a1);
		person p2=new person (13,"onkya", "37437754",a2);
		
		
		System.out.println(p1.contact);
		System.out.println(p2);

	}

}
