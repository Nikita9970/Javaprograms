package nikita123;

public class Test {

	///// need to create seperate funct.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test Num=new Test();
		
		
		  int bigNumber = Num.Great(30,20);
		System.out.println("Big number="+bigNumber); 
	}

	int Great( int a, int b) {
		
		if (a>b)
		{ 
			System.out.println("a is greater than b");
			
			return a;
		}
		else
		{
			System.out.println("b is greater number");
			
			return b;
		}
		
		
	}
	
	
	
	
}
