package HybridInheritance;

public class Child4 extends Parentclass {
	public static void main(String[] args) {
		Child4 obj = new Child4();
		obj.test5();     ////// calling non  static method from other class (parentclass)
		Parentclass.test10();// calling   static method from other class (parentclass)
		System.out.println(obj.e); // calling   non static variable from other class (parentclass)
		System.out.println(Parentclass.j);  // calling   static variable from other class (parentclass)
	}
	
}
