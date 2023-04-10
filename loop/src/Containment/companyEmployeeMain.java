package Containment;

public class companyEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("vikya");
		e1.setDept("com");
		e1.setSalary(46646);
		
		Employee e2= new Employee();
		e2.setId(2);
		e2.setName("onkya");
		e2.setDept("entc");
		e2.setSalary(64446);
		
		
		company c1= new company();
		c1.setId(111);
		c1.setName("tcs");
		c1.setAddress("pune");
		c1.setCom(e1);
		
		System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getAddress()+" "+c1.getCom().getName()+" "+c1.getCom().getDept());
		

	}

}
