package patternprogram;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int row=7;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}


	}

}
