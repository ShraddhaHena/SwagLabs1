
///////// single inheritance  because parent acquires the property of accessspecifierprotected only//
/// so here parent class is sub class and accessspecifierprotected is superclass/// 

package Advancepractice;
import Basicpractice.accessspecifierprotected;

public class parent extends accessspecifierprotected {

	public void demo1() {
		System.out.println("i m  non static method of sub class,, single inheritance");
	}
	public static void demo2() {
		System.out.println("i m static method from sub class ,, single inheritance");
	}
	int b=14;
	static int c=15;
	
	public static void main(String[] args) {
		parent obj = new parent();
		obj.test();
		accessspecifierprotected.demo();
		obj.demo1();
		parent.demo2();
		
		
		System.out.println(obj.a); /// other class property // protected
		
		System.out.println(obj.b); /// this class property // non static member
		
		System.out.println(c);// this class property // static member
	}
}
