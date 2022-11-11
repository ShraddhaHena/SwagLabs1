package HybridInheritance;

public class Child3 extends Parentclass {
	public static void main(String[] args) {
		Child3 obj = new Child3();
		obj.test4();     ////// calling non  static method from other class (parentclass)
		Parentclass.test9();// calling   static method from other class (parentclass)
		System.out.println(obj.d); // calling   non static variable from other class (parentclass)
		System.out.println(Parentclass.i);  // calling   static variable from other class (parentclass)
	}
	

}
