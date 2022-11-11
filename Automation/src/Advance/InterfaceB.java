package Advance; 

public interface InterfaceB  extends Demo, InterfaceA{

	int d=40;
	
	
	 void today();
	
	public static void main(String[] args) {
		System.out.println(d);    // property of Interface InterfaceB
		System.out.println(Demo.a); // property of Interface Demo
		System.out.println(InterfaceA.s); // property of Interface InterfaceA

	}
	
}



// this interface performs multiple inheritance///
//implementation class of this interface is classC (advance package)
