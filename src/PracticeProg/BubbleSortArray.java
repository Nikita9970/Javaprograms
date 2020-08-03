package PracticeProg;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x[]= {8,4,9,3,1,0,7,5};
		
		for(int i=0;i<x.length;i++) {
			int temp;
			
			for(int j=1;j<x.length;j++) {
				
				if(x[j-1]>x[j]) {
				
					temp=x[j-1];
					x[j-1]=x[j];
					x[j]=temp;		
				}
}
			
		}System.out.println("Sorted Array Elements=");
		
		for(int i=0; i < x.length; i++){  
            System.out.print(x[i] + " ");
		
	}

}
}
