package Basic;

public class Nested1 {
	public static void main(String[]args) {
		// Shop should have variety more than 10
		//shop should have minimum 25% discount
		// Shop should have no cost EMI
		
		int variety=01;
		int discount=23;
		boolean noCostEmi = false;
		
		if (variety>10)
		{
			System.out.println ("This shop has more variety");
		}
		if (discount>=25)
		{
			System.out.println("This shop has required discount");
		
		}
		if(noCostEmi == true)
		{
			System.out.println("Lets buy the forniture");
		}
		else
		{
			System.out.println("No");
		}
	}

}
