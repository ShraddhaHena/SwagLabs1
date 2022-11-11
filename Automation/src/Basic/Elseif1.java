package Basic;

public class Elseif1 {

	public static void main(String[]args)
	{
		int marks=135;
		if (marks<=100 && marks>=0)
		{if (marks>=90)
			{
			System.out.println("A+");
			}
		else if (marks<90 && marks>=80)
		{
			System.out.println("A");
		}
		else if (marks<80 && marks>=70)
		{
			System.out.println("B+");
		}
	
		else if (marks<70 && marks>=60)
		{
			System.out.println("B");
		}
	
		else if (marks<60 && marks>=50)
		{
			System.out.println("C");
		}
	
		else if (marks <50 && marks>=40)
		{
			System.out.println("D");
			
		}
		else if (marks<40)
		{
			System.out.println("Fail");
		}
	
		}
		else 
		{
			System.out.println("U have entered wrong value");
		}
	
	
	
	}
	
	
}
