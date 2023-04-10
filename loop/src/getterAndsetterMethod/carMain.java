package getterAndsetterMethod;

public class carMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c1=new car();
		c1.setId(101);
		c1.setName("swift");
		c1.setPrice(150000);
		c1.setCompany("maruti");
		c1.setYear(2000);
		
		System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getPrice()+" "+c1.getCompany()+" "+c1.getYear());

	}

}
