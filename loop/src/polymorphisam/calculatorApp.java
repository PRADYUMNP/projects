package polymorphisam;

public class calculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOperation a = new NumberOperation();
		a.addnumbers(34, 55.00f);
		a.addnumbers(34, 55, 243.00f);
		System.out.println("Addition with (int,int) :"+a.addnumbers(3, 4));

	}

}
