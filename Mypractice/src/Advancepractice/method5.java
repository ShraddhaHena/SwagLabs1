package Advancepractice;

import Basicpractice.method; // to call function from other package -- syntax is packagename.class name  

public class method5 {
	public static void main(String[] args) {
		method m1 = new method();
		m1.reversetriangle(5); // reversetriangle is non static method name from other package so we can call as reference variable.methodname();
	method.reversetriangle1(); // reversetriangle1 is static method from other package (Basicpractice) ,,, syntax:- classname. methodname
	}
 
}
