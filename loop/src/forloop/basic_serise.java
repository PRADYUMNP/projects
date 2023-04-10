package forloop;

public class basic_serise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 4 7 10 13 16 19 22 25......
		//3 3 3 3.....
		
		/*int end=20,a=1;
		for(int i=1; i<=20;i++) {
			System.out.println(a+" ");
			a+=3;
		}
System.out.println("\n");

//1 4 9 16 25 36 49 64 81 100

for(int i=1;i<=10;i++)
{
	System.out.println((i*i)+" ");
}
System.out.println("\n");

//1 3 7 13 21 31 43
//2 4 6 8 10 12
int c=1, x=2;
for(int i=1; i<=7; i++) {
	System.out.println(c+" ");
	c=c+x;
	x=x+2;
}*/

//0 1 1 2 3 5 8 13 21
		/*int n=8;
		int a=0,b=1,c;
		for(int i=0; i<=n;i++ ) {// i=0
			System.out.println(a+" ");
			c=a+b;          //c=0+1=1
			a=b;
			b=c;
		}*/

int m=0,n=1;
/*for(int i=1; i<=9;i++)
{
	int o=m+n;
	System.out.println(m+" ");
	m=n;
	n=o;
}*/

for(int i=1;i<=9;i++) {
	int o=m+n;
	System.out.println(o+" ");
	m=n;
	n=o;
	
}
	}

}
