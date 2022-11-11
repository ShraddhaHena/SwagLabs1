package HybridInheritance;

public class Child2 extends Parentclass {
	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.test3();     ////// calling non  static method from other class (parentclass)
		Parentclass.test8();// calling   static method from other class (parentclass)
		System.out.println(obj.c); // calling   non static variable from other class (parentclass)
		System.out.println(Parentclass.h);  // calling   static variable from other class (parentclass)
	}
	
}
