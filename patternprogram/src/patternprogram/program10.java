package patternprogram;

public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rows = 9;
	        for(int i = 1; i <= rows; i++) {
	            for(int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            for(int k = i; k >= 1; k--) {
	                System.out.print(k);
	            }
	            for(int l = 2; l <= i; l++) {
	                System.out.print(l);
	            }
	            System.out.println();
	        }

	}

}
