package Basicpractice;

public class method3 {

	
	int a=15; // non static global variable /  instance variable  // to call it 1st we have to make object in main method
	static int b= 18; //static global variable // we call it anywhere in main method no need to create object
	
	public void test() // non static regular method
	{
		int i=70; // local variable 
		System.out.println("Hello");
		System.out.println(b); // static variable can be called inside the non static method
		System.out.println(a); // non static variable can be called inside the non static method
	System.out.println(i); // we can call i here only 
	}
	
	public void demo() // non static regular method don't occupy memory until creating object
	{
		System.out.println("demo"); 
		// System.out.println(i); // we can't run i here because its a local variable  and created on test method 

	}
	
	public static void Hi() // static regular method // static method occupies memory every time
	{
		System.out.println(" Hi everyone");
		System.out.println(b); // static variable can be called inside the static method
		// System.out.println(a); // non static variable can't  be called inside the  static method
	}
	
	
	// all these regular methods are not going to until creating object on main method
	
	public static void main(String[] args) {
		System.out.println(b); // b directly run but for a we need object creation
		method3 obj = new method3();
		System.out.println(obj.a); // with help of object we can run a 
	}
	
}
