package Casting;

public class Implicitecasting {
   public static void main(String[] args) {
	
	   byte b=120;
	   short s= b; // byte to short // implicite casting
	   int i =s; //  short to integer
	   double d=i; // integer to double 
	   
	   System.out.println(d );// 120.0 
	   
}
}
