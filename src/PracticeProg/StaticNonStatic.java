package PracticeProg;

public class StaticNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStatic.m1();
				StaticNonStatic x= new StaticNonStatic();
				x.m2();		
		another.m3();
		another y=new another();
		y.m4();
		}
	
	static void m1() {
		
		int a=10, b=10;
		int Add=a+b;
	System.out.println("Substraction m2="+Add);
		
	}
	
	void m2() {
		
		int a=20, b=10;
		int Sub=a-b;
		System.out.println("Addition m1="+Sub);
	}

}
class another{
	
	static void m3() {
		int a=2, b=2;
		int Mult=a*b;
		System.out.println("Multiplication m3="+Mult);
	}
void m4() {
		
		int a=2, b=1;
		int Sub=a-b;
		System.out.println("Addition m4="+Sub);
	}	
	
}
