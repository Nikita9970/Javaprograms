package nikita123;

public class Operators {

	public static void main(String[] args) {
		
		Operators subs=new Operators();
		subs.sub(7);
		
		int a=7;
		a++;
		
		System.out.println("A++="+a);	
		
	}
	
	int sub (int b) //int x
	{
	
		--b;
		System.out.println("--A="+b);
		return b;
		
	}
	
	
}

