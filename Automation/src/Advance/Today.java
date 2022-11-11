package Advance;

public class Today extends abstractionpractice1 {
	
	
	public void demo() {
		System.out.println("completed abstract method");
	}
	
	
	public static void main(String[] args) {
		Today obj = new Today();
		obj.demo(); // incomplete method from other class
		obj.test(); // non static method of other class
		abstractionpractice1.test1(); // static method of other class
	}
	
	
	// this class Today is called concrete class because it complete the method demo , which is from abstrract class.
	
	
}
