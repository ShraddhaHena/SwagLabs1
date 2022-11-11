package Basicpractice;

public class accessspecifier1 { // accessed from same package class
public static void main(String[] args) {
	accessspecifier obj=new accessspecifier();
	System.out.println(obj.a); //  a is public non static variable ,, syntax  to run variable(a) in other class is :- Syso (reference variable (obj). variable (a))
	obj.test(); // test is public method,, syntax to run methods in other class is reference variable(obj).method name();
accessspecifier.demo(); // as it is static method so no need to create obj,, we can call it with help of obj and also with out object
obj.demo();
System.out.println(accessspecifier.b);



}
}
