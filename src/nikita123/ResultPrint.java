package nikita123;

public class ResultPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResultPrint val=new ResultPrint();
		int num=val.Percentage(12);
		
		System.out.println("Percentage="+num);

	}

	
	int Percentage( int percent)
	{
	
	if(percent>=40 && percent<50)
	{
		
		System.out.println("It is Pass class");
	}
	else if(percent >=50 && percent<=60)
	{
		System.out.println("It is First class");
	}
	else if(percent >60)
	{
		System.out.println("It is Distinction");
	}
	else
	{
		System.out.println("Fail");
	}
	
	return percent;
}
}
