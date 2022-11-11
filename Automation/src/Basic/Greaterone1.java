package Basic;

public class Greaterone1 {
	public static void main(String[] args) 
	{
			int a=40;
			int b=25;
			int c=40;
			if(a==b && b==c && c==a)
			{
				System.out.println("All values are Equal");
				System.out.println("The Number is = "+ a);
			}
			else if( (a==b || a==c) || (b==a || b==c) || (c==a || c==b))
			{
				System.out.println("Two Numbers are Equal");
			}
			
			 if(a>=b && a>=c)
					{
						System.out.println("Greatest of 3 Number = " + a);
					}
					else if(b>=a && b>=c)
					{
						System.out.println("Greatest of 3 Number = " + b);
					}
					else if(c>=b && c>=a)
					{
						System.out.println("Greatest of 3 Number = " + c);
					}
}
}