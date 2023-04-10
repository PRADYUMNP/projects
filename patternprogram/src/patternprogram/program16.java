package patternprogram;

public class program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 6;
	        for (int i = 1; i <= n; i++) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print((char)('A' + k - 1) + " ");
	            }
	            System.out.println();
	        }
	}

}
