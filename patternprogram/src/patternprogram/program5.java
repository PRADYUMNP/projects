package patternprogram;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int n = 5; 

		        for (int i = 1; i <= n; i++) {
		            // Print spaces
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print(" ");
		            }
		            
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }
		           
		            for (int j = i - 1; j >= 1; j--) {
		                System.out.print(j);
		            }
		           
		            System.out.println();
		        }

		        for (int i = n - 1; i >= 1; i--) {
		            
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print(" ");
		            }
		            
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }
		            
		            for (int j = i - 1; j >= 1; j--) {
		                System.out.print(j);
		            }
		            
		            System.out.println();
		        }
		        for (int i = 0; i < 2 * n + 1; i++) {
		            System.out.print('*');
		        }
		        System.out.println();
		    }

	}


