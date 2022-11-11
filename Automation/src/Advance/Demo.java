package Advance;

public interface Demo {
int a=10; // by default static , final

 void test(); // not need to declare public here because methods inside interface by default public and abstract



////public void hello() {} /// we can't declare complete non static method in interface
 
////public void hello() ; /// we can't declare incomplete  static method in interface


static void hii() {
	System.out.println("i m static"); 
}


public static void main(String[] args) {
	System.out.println(Demo.a);
	
	
	// Demo obj = new Demo(); // unable to create object in interface
	// interface mei object create karenge v toh kisko call karen?? variables and static method ke liye obj kli jarurat nhii & non static incomplete hoite h
	
	
}
}



// we can run the variables in interface but not methods as we unable to create obj ,, so we run these methods in implimentation class