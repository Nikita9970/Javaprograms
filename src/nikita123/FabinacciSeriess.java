package nikita123;

public class FabinacciSeriess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A1=0;
		int A2=1;
		int A3=1;
		int i=0;
		while(i<=10) {
		
			A3=A1+A2;
			System.out.println(A3);
			A1=A2;
			A2=A3;
			i++;
			
	}
		
}
}