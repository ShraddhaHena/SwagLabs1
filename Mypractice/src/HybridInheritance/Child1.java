package HybridInheritance;

public class Child1 extends Parentclass {

	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.test2();     ////// calling non  static method from other class (parentclass)
		Parentclass.test7();// calling   static method from other class (parentclass)
		System.out.println(obj.b); // calling   non static variable from other class (parentclass)
		System.out.println(Parentclass.g);  // calling   static variable from other class (parentclass)
	}
	
	
}
