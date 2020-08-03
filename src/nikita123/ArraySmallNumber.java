package nikita123;

public class ArraySmallNumber {

	public static void main(String[] args) {
		
		//int Num[]= new int[5];
		int Num[]= {50,20,30,2,3,1};
		int smallNum=Num[0];
		
		for(int i=0;i<Num.length; i++) {
			
			if(smallNum > Num[i]) {
				
			smallNum=Num[i];
			}
		}
		
			System.out.println("Smallest Number is="+smallNum);
			
	}

}
