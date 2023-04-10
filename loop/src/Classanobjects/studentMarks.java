package Classanobjects;

public class studentMarks {
	
	int id;
	String name;
	float m1,m2,m3;
	
	void setData(int id,String name, float m1,float m2,float m3)
	{
		this.id=id;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	
	float percentage()
	{
		float percent=(m1+m2+m3)/3;
		return percent;
	}
	
	void grade(float percent)
	{
		if(percent>=70)
		{
			System.out.println("distinction");
		}
		else if(percent>=60)
		{
			System.out.println("first class");
		}
		else if(percent>=50)
		{
			System.out.println("second class");
		}
		else if(percent>=35)
		{
			System.out.println("pass class");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
