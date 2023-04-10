package getterAndsetterMethod;

public class EmployeeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("vikya");
		e1.setDept("comp");
		e1.setSalary(10000);
		e1.setContact("7448000650");
		
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getSalary()+" "+e1.getContact());

	}

}
