//child

package Casting;

public class upcasting1 extends upcasting {

	
	public void demo() {
		System.out.println("i am child property");
	}
	
	public void test() {
		System.out.println(" modified upcasting ");
	}

	public static void main(String[] args) {
		 
		upcasting1 obj = new upcasting1 ();
		obj.demo();
		obj.test();
		obj.hello();
		
		
		upcasting obj1 = new upcasting ();
          obj1.test();
	      obj1.hello();
		
			upcasting obj2 = new upcasting1(); // upcasting method 
			
			obj2.test();
		      obj2.hello();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
