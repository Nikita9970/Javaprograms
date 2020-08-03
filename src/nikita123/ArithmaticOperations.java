package nikita123;

public class ArithmaticOperations {

	public static void main(String[] args) {
		
		ArithmaticOperations AddFunction=new ArithmaticOperations(); 
		AddFunction.add(10, 20);
		ArithmaticOperations SubFunc=new ArithmaticOperations();
		SubFunc.sub(30, 20);
		ArithmaticOperations DivFunc= new ArithmaticOperations();
		DivFunc.div(70.0f,30.0f);
		
		
	}
	void add( int a, int b) {
	//with Void

	int result=0;
	result=a+b;
	
	System.out.println("first result=" +result);
	}
	
	int sub(int v, int w) {
		//without void
		int result2=0;
		result2=v-w;
		System.out.println("Substraction result=" +result2);	
		return result2;
			
	}
	
	float div (float a, float b) {
		
		
		float result=0;
		result= a/b;
		System.out.println("division result="+result);
		return result;
		
		//want to print module of same
	}
	
	
	
	
	
}
