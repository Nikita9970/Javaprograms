package PracticeProg;

public class ReplacementOfNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]= {10,7,9,7,8,5,7,6,7,7};
	
		for(int i=1;i<x.length;i++) {
			
			
			
			if(x[i]==7) {
				
				x[i]=0;
			}
			
		} System.out.println("New Array=");
		for(int i=1;i<x.length;i++)
		{
			
			System.out.println(x[i]);
		}
		
	}
	

}
