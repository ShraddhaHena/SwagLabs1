package Casting;

public class Explicitecasting {
 public static void main(String[] args) {
	

	
	double d= 75.5;
     short s = (short)d; // double to short
     int i = (int) s;
     byte b = (byte) i; // int to byte
   
     System.out.println(b); //75
// size of the variable not decreases every time
 }
     
    
}
