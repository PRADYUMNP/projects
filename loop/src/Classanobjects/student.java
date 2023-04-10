package Classanobjects;

public class student {
	
	int id;
	String name,dept;
	float marks;
	
	
	void setstudentData(int id, String name, String dept, float marks) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
		
		
		display();
	}
	
	void display() {
		System.out.println(id+" "+name+" "+dept+" "+marks);
	}

}
