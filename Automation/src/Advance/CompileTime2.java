package Advance;

public class CompileTime2 { // over loading static method

	
	
	public static void test() {
		System.out.println("Hello");
	}
	
	public static void test(int a) {
		System.out.println("Hello everyone");
	}
	
	
	// two methods with same method name but having different body is called method overloading
	
	                  //// ---------....-------////
	
	
	
	/// over loading main method///
	//-----------------------------
	
	
	public static void main(String[] args) {
		CompileTime2.test();
		CompileTime2.test(4);
	}
	public static void main(int a) { // we can over load main method but execution will start with default main method only i.e with  public static void main ( String[]args){ 	}
		System.out.println("main method");
	}
	
	
	
	
	
	
	
	
	
	
}
