package Basic;

public class forloop2 {
	
public static void main(String[]args)
{
	for (int a=0; a<=4; a++)
	{
		for (int b=3; b>=a;b--)
		{
			System.out.print(" * ");

		} 
		for(int c=1; c<=a;c++)
		{
			System.out.print("    ");
		}
		
		for(int d=3; d>=a; d--) {
			System.out.print(" * ");
		}

	System.out.println();
	}
}
}


