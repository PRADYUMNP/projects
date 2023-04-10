package Containment;

public class AddperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persongetset p1= new persongetset();
		p1.setId(111);
		p1.setName("vikya");
		p1.setContact("7448000650");
		
		persongetset p2= new persongetset();
		p2.setId(112);
		p2.setName("onkya");
		p2.setContact("3554776848");
		
		
		Addressgetset add= new Addressgetset();
		add.setCity("pune");
		add.setState("maharashtra");
		add.setCountry("india");
		add.setAdd(p1);
	
		
		
		System.out.println(add.getCity()+" "+add.getState()+" "+add.getCountry()+" "+add.getAdd().getId()+" "+add.getAdd().getName()+" "+add.getAdd().getContact());

	}

}
