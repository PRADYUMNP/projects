package patternprogram;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		} 
		for(int i=row-1;i>=1; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
