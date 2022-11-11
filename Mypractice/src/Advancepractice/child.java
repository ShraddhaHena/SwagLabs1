
///////// multi level inheritance  because child acquires the property of parent only which acquired  the property of accessspecifierprotected//

/// so here parent class is super class and child class is sub class/// 



package Advancepractice;

public class child extends parent {
int d= 13;
static int e=16;

public void demo3() {
	System.out.println("i m non static method of sub class,, multi level inheritance");
}
	public static void demo4() {
		System.out.println("i m  static method of sub class,, multi level inheritance");
	}
	
	public static void main(String[] args) {
		child obj = new child();
		obj.demo3(); // non static method from this class
		child.demo4(); //  static method from this class
		obj.demo1(); // non static method from super class (parent)
		parent.demo2(); //  static method from super class (parent)
		System.out.println(obj.b); //non static variable from super class (parent)
		System.out.println(parent.c); // static variable from super class (parent)
System.out.println(obj.d);//non static variable from this class

System.out.println(e);//non static variable from this class

	}
	
	
}
