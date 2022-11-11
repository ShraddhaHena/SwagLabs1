package Basic;

public class Greaterone {
public static void main(String[]args){
	int a=15;
	int b=15;
	int c=10
			;
	if (a>b && b>c )
		{
		System.out.println("a is greater");
		}
	
	else if (b>c && c>a)
	{
		System.out.println("b is greater");
		
	}
	else if (c>b && b>a)
	{
		System.out.println("c is greater");
	}
	else if (a==b && b>c)
	{
		System.out.println("a & b both are  greater & equal also");
	}
	else if (b==c && c>a)
	{
		System.out.println("b&c both are  greater & equal also");
	}
}
}
