package PracticeProg;

public class StaticMethArrayAdd {
	
	public static void main(String[] args) {
		
		
		StaticMethArrayAdd.sum(new int[] {10,10,10,10});
		
		
		
	}

	
	static void   sum(int[] no) {
		
		int total=0;
		for(int i:no)
		
		{
			
			total=total+i;
		}
		System.out.print(total);
	}
	
}
