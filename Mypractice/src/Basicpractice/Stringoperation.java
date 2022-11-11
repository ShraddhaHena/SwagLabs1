package Basicpractice;

public class Stringoperation {

	public static void main (String[]args) 
	{
		String s1 = "Heena";
		String s2 = "Nayak";

		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());

		System.out.println(s1.length());
		System.out.println(s2.length());

		System.out.println(s1.equals(s2)); // this always shows the results in boolean form
		
		System.out.println(s1.equalsIgnoreCase(s2)); 
		
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(3,5));
		
		System.out.println(s1.concat(s2));
		System.out.println(s1. charAt(2));
		
		System.out.println(s1.contains("en"));
		
		
		
		
	}
	
	
}
