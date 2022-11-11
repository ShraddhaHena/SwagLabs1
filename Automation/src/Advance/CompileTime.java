 
// compile time poly morphism// 


package Advance;

public class CompileTime {// method over loading in non static method

	public void test() {
		System.out.println("Zero Argument");
	}
	
	public void test(int a) {
		System.out.println("Int Argument");
	}
	
	public void test (String s) {
		System.out.println("String Argument");
	}
	
	public static void main(String[] args) {
		CompileTime obj = new CompileTime ();
			obj.test();
		obj.test(1);
		obj.test("hii");
	}
	
}
