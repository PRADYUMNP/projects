package Classanobjects;

public class studentMarksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentMarks s1=new studentMarks();
		studentMarks s2=new studentMarks();
		
		
		s1.setData(55, "vikya", 70, 75, 70);
		s2.setData(67, "onkya", 65.5f, 50.4f, 70.7f);
		
		float per= s2.percentage();
		s2.grade(per);

	}

}
