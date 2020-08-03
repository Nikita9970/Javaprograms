package nikita123;

public class UppercaseLowecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UppercaseLowecase let =new UppercaseLowecase();
		int Char = let.letter('b');
		
		System.out.println("letter is"+Char);
	}

	
	
	int letter(int ch) {
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("Letter is lowercase");
			
		}
		else if(ch>= 'A' && ch<='Z')
		{
			System.out.println("Letter is Uppercase");
		}
		
		else {
			
			System.out.println("Please enter valid letter");
		}
		
		return ch;
	}
	
	
}
