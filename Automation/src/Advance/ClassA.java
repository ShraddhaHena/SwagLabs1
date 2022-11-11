package Advance;

import Basic.ClassB;

public class ClassA implements Demo { // implementation class
	
	
public void test() { // completing method interface // here we can't wrote as  void test();
	System.out.println("completed method of interface");
}



public static void main(String[] args) {
	ClassA obj= new ClassA();
	obj.test();
	System.out.println(Demo.a);
     Demo.hii(); // calling static method from interface Demo
	
}





}
