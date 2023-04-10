package loop;

public class MinimumMaximumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =71562;
		int max =num%10,min=num%10;
		
		while(num!=0)
		{
			int r= num%10;
			if(r<max)
			{
				max=r;
			}
			if(r<min);
			{
				min=r;
			}
			num=num/10;
		}
		 System.out.println("maximum digit: "+min) ;
		 System.out.println("minimum digit: "+max);

	}

}
