package Basicpractice;

public  class  Concreteclass  extends Abstractclass {

	public void demo1() {
		System.out.println(" i am complete now");
	}
	
public static void main(String[] args) {
	Concreteclass obj = new Concreteclass();
	obj.demo1(); // incomplete method of other class 
	obj.demo();// complete non static  method of other class
	Abstractclass.demo2(); // complete static method from other class
	System.out.println(obj.a); // non static variable from other class
	System.out.println(Abstractclass.b);//  static variable from other class
}
}
