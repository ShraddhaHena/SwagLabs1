package Advancepractice;
import HybridInheritance.Parentclass;
public class Child5 extends Parentclass {
	public static void main(String[] args) {
		Child5 obj = new Child5();
		obj.test11();     ////// calling non  static method from other class (parentclass)
		Parentclass.test12();// calling   static method from other class (parentclass)
		System.out.println(obj.k); // calling   non static variable from other class (parentclass)
		System.out.println(Parentclass.l);  // calling   static variable from other class (parentclass)
	} /// In case of inheritance if u want to call variable or method  property from other package then ensure that the vqariable should be with protected key word// 

}






 /// que-- in this class method protected as well as public both  working bt not in parent class???////