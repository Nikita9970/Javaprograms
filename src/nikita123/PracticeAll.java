package nikita123;

public class PracticeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRow=5;
		
		for(int row=1; row<=totalRow; row++) {
			
			for (int st=1; st<=row; st++) {
				System.out.print("*");
			}
			for(int sp=1; sp<=totalRow-row; sp++) {
				
				System.out.print(" ");
			}
			System.out.println();
			
		}
		int TotalRow=4;
				for(int row1=1; row1<=TotalRow; row1++) {
					
					for (int st1=1; st1<=TotalRow-row1+1; st1++) {
						System.out.print("*");
					}	
					for(int sp1=1; sp1<=row1-1; sp1++) {
						
						System.out.print(" ");
					}
					System.out.println();
				}
	
			
		}
}		
		
	
		
		
		
		
		

	

