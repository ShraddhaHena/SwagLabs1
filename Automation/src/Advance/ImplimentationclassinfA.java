package Advance;

public class ImplimentationclassinfA extends abstractionpractice1 implements InterfaceA{

	
	public void day() {
		System.out.println("i m propery of Interface A");
	}
	
	public void demo() {
		System.out.println("i m propery of Thursday");
	}
	
	
	
	public static void main(String[] args) {
		ImplimentationclassinfA obj = new ImplimentationclassinfA();
		
		obj.demo();
		obj.day();
		System.out.println(InterfaceA.s);
	}
	
	
	
	
}
