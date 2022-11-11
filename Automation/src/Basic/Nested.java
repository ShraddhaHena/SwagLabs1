package Basic;

public class Nested {
	
public static void main(String[]args) {
	// Shop should have variety more than 10
	//shop should have minimum 25% discount
	// Shop should have no cost EMI
	
	int variety=10;
	int discount=20;
	boolean noCostEmi = false;
	
	if (variety>10)
	{
		System.out.println ("This shop has more variety");
	
	if (discount>=25)
	{
		System.out.println("This shop has required discount");
	
	
	if(noCostEmi == true)
	{
		System.out.println("Lets buy the forniture from this shop");
	}
	else
	{
		System.out.println("No cost emi is not available");
	}}
	else
	{
		System.out.println("Discount is less");
	}
	}
	else 
	{
		System.out.println("variety ate less");
	}
	
	
	
}
}
