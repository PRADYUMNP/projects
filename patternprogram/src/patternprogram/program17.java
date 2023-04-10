package patternprogram;

public class program17 {
	public static void main (String[]args) {
		 int n = 6;
	        for (int i = 1; i <= n; i++) {
	            for (int j = n; j > i; j--) {
	                System.out.print((char)('A' + j - 1) + " ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print((char)('A' + n - k) + " ");
	            }
	            System.out.println();
	        }
	}

}
