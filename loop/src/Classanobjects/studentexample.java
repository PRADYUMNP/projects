package Classanobjects;

public class studentexample {

	int id;
	String name,email,std;
	double marks;
	
	void setData(int i,String n, String e, String s,double m ) {
		id=i;
		name=n;
		std=s;
		email=e;
		marks=m;
	

	}
void display () {
	System.out.println(id+" "+name+" "+ std+" "+email+" "+marks);
}
}
