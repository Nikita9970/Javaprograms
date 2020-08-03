package nikita123;

public class Pattern1Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalRow=5;
		 for(int row=1; row<= totalRow; row++) {
			 
			 for(int space=1; space<=totalRow-row; space++ ) {
				 
				 System.out.print(" "); 
			 }
		 
			 for (int st=1; st<=2*row-1; st++) {
				
				System.out.print("*");
			}
		 
	
			System.out.println();
		}
		
		 
	}

}
