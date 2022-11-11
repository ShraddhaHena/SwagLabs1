package Basicpractice;

public class Instance {
int a=30; // not static variable or instance variable , so we call this variable with the help of obj only
String s= " i m an object";
 static int i = 35; // static variable , so we can call it any where without any obj



public static void main(String[] args) {
	 Instance m1 =  new Instance();// for non static variables we have to create object
	 System.out.println(m1.a); // then we have to call the variable with m1 (reference variable) . a (non static variable)
     System.out.println(m1.s); // reference name. variable 
     System.out.println(i); 
     System.out.println(Instance. i); 
System.out.println(Instance3.i);
}
}
