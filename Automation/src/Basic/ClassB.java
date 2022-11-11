package Basic;
import Advance.Demo;
public class ClassB {
	public void test() { // here we can't wrote as  void test();
		System.out.println("completed method of interface");
	}
	
	public static void main(String[] args) {
		ClassB obj= new ClassB();
		obj.test();
		System.out.println(Demo.a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
