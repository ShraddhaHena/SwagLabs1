package Basicpractice;

public class accessspecifierprotected { 

	protected int a =70;
	 protected void test() { // protected method can called with in the package only with condition of inheritance
		System.out.println("i am protected");
	}
	
	
	protected static void demo() {
		System.out.println("i am static");
	}
	
	
	public static void main(String[] args) {
		accessspecifierprotected obj= new accessspecifierprotected ();
		obj.test();
		accessspecifierprotected.demo();
		System.out.println(obj.a);
	}
	
}
