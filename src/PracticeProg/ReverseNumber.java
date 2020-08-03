package PracticeProg;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int no =15754;
			int remainder, reverse=0;
			
			System.out.println("Original Number="+no);
			
			while(no!=0) {
				
				remainder=no%10;
				reverse= reverse*10+remainder;
				
				no=no/10;
				
				
			}
		
		System.out.println("Reverse Number="+reverse);
	}

}
