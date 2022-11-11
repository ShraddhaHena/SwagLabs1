package Basicpractice;

public class Instance2 {
	
	int b=20;
	
	
public static void main(String[] args) {
	
	Instance m1 =  new Instance();// for non static variables we have to create object
	 System.out.println(m1.a); // then we have to call the variable with m1 (reference variable) . a (non static variable)
    System.out.println(m1.s);
    System.out.println(Instance.i);// static variable from other classes is called like classname.variable i.e; Instance.i
   
    
    
    Instance2 m2 = new Instance2();
    System.out.println(m2.b);  // every non static variables from different class need their own object from their own class only. i.e variable a & s needs obj creation from instance and varible b needs obj creation instance2. 
    

	
	
    System.out.println(Instance.i); // any where we can call like this
	
}
}
