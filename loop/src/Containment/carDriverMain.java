package Containment;

class carDriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver d1= new Driver();
		d1.setId(1);
		d1.setName("onkya");
		d1.setContact("7448000650");
		
		Driver d2 = new Driver();
		d2.setId(2);
		d2.setName("vikya");
		d2.setContact("3757909575");
		
		car c1=new car();
		c1.setId(121);
		c1.setName("nano");
		c1.setNumber(2333);
		c1.setDr(d1);
		
		System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getNumber()+" "+c1.getDr().getName()+" "+c1.getDr().getContact());

	}

}
