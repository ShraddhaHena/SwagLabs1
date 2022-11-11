package Finalkeyword;

public class Finalvariable { // final class,, inheritance of this class is not possible

	
	final int a=30; // final variable ,, so we cant change the value of a
	 String c = "hello";
	 public final void test() {
		 System.out.println("hii");
		// a=50;
		//  System.out.println(a);
		 
	 }
	 
	 public static final void test1() { // final method,, so we cant insert test1
		 System.out.println("how are u");
	 }
	
	
	public static void main(String[] args) {
		Finalvariable obj = new Finalvariable();
		obj.test();
		Finalvariable.test1();
		System.out.println(obj.a);
		
	}
	
	
	
	
	
	
}
