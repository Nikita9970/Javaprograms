package PracticeProg;

public class SearchingElementArray {

		public static void main(String[] args) {
			
		  int a[][]= {{1,3,2,3},{7,9,6,1},{3,6,7,9}};
		  
			
		  int total=0;
		  for(int i=0;i<a.length;i++) {
			 
			  //int total=0;
			  for(int j=0;j<a[i].length;j++) {
			  
			  //System.out.print(a[i][j]+" ");
			  
				  
			  total=total+a[i][j];
			  
		  } 
			  //System.out.println();
			  System.out.println(total);
			
		}  
		  
		
}
}




