package nikita123;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOdd Num= new EvenOdd();
		int num= Num.method(111);
		System.out.println("Entred number is "+num);
		
	}

	
	int method(int a){
		
		if(a%2==0) {
			System.out.println("Number is Even");
			
		}
		else
		{
			System.out.println("Number is Odd");
		}
		
		return a;
	}
	
}
