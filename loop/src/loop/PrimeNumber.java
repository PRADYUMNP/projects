package loop;

public class PrimeNumber {
	public static void main(String[] args) {
	/*	int num=11,c=2;
		int mid= num/2;
		
		while(c<=mid) {
			if(num%c==0) {
				System.out.println("not a prime number");
				break;
				
			}
			c++;
			
		}
		if(c<mid)
			System.out.println("prime number");*/
		
		int num=10,c=2;
		int mid=num/2;
		boolean flag= true;
		while(c<=num-1) {
			if(num%c == 0) {
				flag=false;
				break;
				
			}
			c++;
		}
		if(flag==true)
			System.out.println("prime number");
		else
			System.out.println("not prime number");
}}