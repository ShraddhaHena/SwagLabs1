
// run time polymorphism//
package Advancepractice;

public class Childclass extends Parentclass{
int i=10;
protected 	void demo() {
	System.out.println("i m property of childclass");}
	
	public void test() {/// method over riding // run time polymorphism

		System.out.println("i m overrided  "); }
		
    public static void monday() { // static method can't be over rided,, this is called method hiding
			System.out.println("trying to over ride");
		}
    public void hello() {
     super.test(); // it will call test from parentclass
         this.test();
    }
	

	
	public static void main(String[] args) {
		Parentclass obj = new Parentclass();
		 obj.test(); // will show argument of parent class
		Parentclass.monday();
		Childclass.monday();
		
		
		
		Childclass obj1 = new Childclass();
	
		 // will show argument of child class

	}
	
	
	
}
