package Advancepractice;
import Basicpractice.accessspecifier; // importing class from other package 
public class accessspecifier2 {       //// accessed from same package class
public static void main(String[] args) {
	accessspecifier obj=new accessspecifier();
System.out.println(obj.a);
obj.test();
obj.demo();
accessspecifier.demo(); // as it is static method so no need to create obj,, we can call it with help of obj and also with out object
}
}
