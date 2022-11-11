package Basic;

public class forlooppractice1 {
 public static void main(String[]args) {
	
	 for (int i=1; i<=4;i++) //1
		{
			for (int j=4; j>i; j--)// 
			{  
				System.out.print("  "); // " " 
			}
			
			for (int k=1; k<=i; k++) //
			{ 
				System.out.print( "  *  " );
			}
			
			System.out.println(" "); 
			
		}
	 
	 for (int a=5; a>=1;a--) //54
		{
			for (int b=5; b>a; b--)//54
			{
				System.out.print("  "); // " " 	
			}
			
			for (int b=1; b<=a; b++) //
			{
				System.out.print( "  * " );
			}
			
			System.out.println(" "); 
			
			
			
			
			
			
		}
	
 }
 }
