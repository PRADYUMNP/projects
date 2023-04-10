package patternprogram;

public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 9;
	        for(int i = 1; i <= rows; i++) {
	            for(int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            for(int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }
	            for(int l = i - 1; l >= 1; l--) {
	                System.out.print(l);
	            }
	            System.out.println();
	        }

	}

}
