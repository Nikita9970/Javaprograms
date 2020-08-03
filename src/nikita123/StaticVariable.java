package nikita123;

public class StaticVariable {

	
		int a=5;
		static int b=7;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable sv=new StaticVariable();
	sv.demoStatic();
	demo demo=new demo();
	demo.m();
	demo.m1();
		
		}
	
	void demoStatic(){
		StaticVariable sv=new StaticVariable();
		System.out.println("a="+sv.a);
	}
}

		class demo{
			
			
			static void m() {
				StaticVariable sv=new StaticVariable();
				System.out.println("a="+sv.a+"b="+StaticVariable.b);
				
			}
			
			void m1() {
				
				StaticVariable sv=new StaticVariable();
				System.out.println("a="+sv.a+"b="+StaticVariable.b);	
				
			}
	
	}

		
