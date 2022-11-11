package Basicpractice;

public class accessspecifierprivate {
	public accessspecifierprivate() { ///constructor
		
	}

	private void test() { // protected method can called with in the package only
		System.out.println("i am private");
	}
	
	
private static void demo() {
		System.out.println("i am static");
	}
	
	public static void main(String[] args) {
		accessspecifierprivate obj = new accessspecifierprivate();
		accessspecifierprivate.demo(); 
		obj.test();
	}
}
