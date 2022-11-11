
///////// multi level inheritance  because Grandchild acquires the property of child only, which acquired  the property of child and child acquired the property of parent and parent acquired the property of accessspecifierprotected//

////// so here child class is super class and GRandchild class is sub class/// 



package Advancepractice;

public class Grandchild extends child{
	int f= 13;
	static int g=16;

	public void demo5() {
		System.out.println("i m non static method of sub class,, multi level inheritance");
	}
		public static void demo6() {
			System.out.println("i m  static method of sub class,, muti level inheritance");
		}
		
		public static void main(String[] args) {
			Grandchild obj = new Grandchild();
			obj.demo5(); // non static method from this class
			Grandchild.demo6(); //  static method from this class
			obj.demo3(); // non static method from super class (parent)
			child.demo4(); //  static method from super class (parent)
			System.out.println(obj.d); //non static variable from super class (child)
			System.out.println(child.e); // static variable from super class (child)
	System.out.println(obj.f);//non static variable from this class

	System.out.println(g);//non static variable from this class

		}
		
}
