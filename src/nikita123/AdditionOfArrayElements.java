package nikita123;

public class AdditionOfArrayElements {

	public static void main(String[] args) {
		
		int x[][]= {{1,1},{1,1},{1,1},{1,1}};
	
		for(int i=0;i<x.length; i++) {
			for(int j=0;j<x[i].length;j++) {
				
				System.out.print(x[i][j]+" ");
				
			}
			
			System.out.println();
		}
		System.out.println();
		
		int y[][]= {{1,1},{1,1},{1,1},{1,1}};
		
		for(int i=0;i<y.length; i++) {
			for(int j=0;j<y[i].length;j++) {
				
				System.out.print(y[i][j]+" ");
			}
		
			System.out.println();
	}

	
	
	
	
}
}
