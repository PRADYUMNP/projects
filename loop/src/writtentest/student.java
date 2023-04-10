package writtentest;

public class student {
	int id;
	String name1,name2;
	
	
	void setData(int i, String n1, String n2) {
		id=i;
		name1 = n1;
		name2 = n2;
		
	}
	
	
	void display () {
		System.out.println(id+" "+name1+" "+name2);
	}

}
