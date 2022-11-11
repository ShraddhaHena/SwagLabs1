
package Basicpractice;  

public class method {
	
 public void triangle () // method name triangle // this is  a regular method , triangle is method name 
                         // public void triangle ()  {} --- this total termed as method declaration
                          // {} is called method body, we wrote codes /logic inside the method body only
 { // method body starts
	 for( int a=1; a<=5; a++)//1
		{
			for (int j =1; j<=a; j++)
					{
				System.out.print(" * ");
					}
			System.out.println();
		} // we want to print the same triangle as in forloop so we paste the same code here inside
		
 } // method body  ends 
 
 public void reversetriangle () // method name = reversetriangle
 {
	 for( int a= 1; a<=5; a++)//1
		{
			for (int j =5; j>=a; j--)
					{
				System.out.print(" * ");
					}
			System.out.println();
		}
 }
 public static  void reversetriangle1 () // method name = reversetriangle1
 {
	 for( int a= 1; a<=5; a++)//1
		{
			for (int j =5; j>=a; j--)
					{
				System.out.print(" * ");
					}
			System.out.println();
		}
 }
 public void evenorodd() // methodname = evenorodd
 {
	 int a=11;
	 if (a%2 == 0)
	 {
		 System.out.println("even");
	 }
	 else {
		 System.out.println("odd");
	 }
 }
 public void evenorodd1(int a) // methodname = evenorodd1 // parameterized method 
 {
	 
	 if (a%2 == 0)
	 {
		 System.out.println("even");
	 }
	 else {
		 System.out.println("odd");
	 }
 }
public void reversetriangle(int i) // parameterized method 
{
	 for( int a= 1; a<=5; a++)//1
		{
			for (int j =5; j>=a; j--)
					{
				System.out.print(" * ");
					}
			System.out.println();
		}
}
 
 
 public static void main(String[] args) {
	method m4 = new method ();
	m4.triangle (); // we dont need to write code here to get the same right angle triangle just write // obj name . method name i.e m4. triangle
	m4.triangle ();// to get a repeated triangle here we don't need to write code repeatedly just have to mention ; reference variable. method name n times 
    m4.reversetriangle();
    m4.evenorodd(); 
    m4.evenorodd1(9); // in method evenorodd1  we declared the variable name with method name so we can call here like this ,,, instead of 9 we can place any othere number also
    m4.evenorodd1(8); 
m4.reversetriangle();

 }
 
}
