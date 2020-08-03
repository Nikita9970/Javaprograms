package PracticeProg;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[]= {10,7,9,8,5,6};
		int temp=x[0];
		for(int i=1;i<x.length;i++) {
			
			
			
			if(temp>x[i]) {
				
				temp=x[i];
			}
			
		} System.out.println("Smallest Number="+temp);
		
		
		
	}

}
