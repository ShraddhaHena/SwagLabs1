package HybridInheritance;

public class Parentclass {
int a=1;
int b=2;
int c=3;
int d=4;
int e=5;
protected int k=11;
static  int f=6;
static int g=7;
static int h=8;
static int i=9;
static int j=10;
protected static int l=12;
public void test1() {
	System.out.println("1st inheritance");
}

public void test2() {
	System.out.println("2nd inheritance");
}

public void test3() {
	System.out.println("3rd inheritance");
}

public void test4() {
	System.out.println("4th inheritance");
}
public void test5() {
	 System.out.println("5th inheritance");
}

public static void test6() {
	System.out.println("6th inheritance");
}

public static void test7() {
	System.out.println("7th inheritance");
}


public static void test8() {
	System.out.println("8th inheritance");
}


public static void test9() {
	System.out.println("9th inheritance");
}


public static void test10() {
	System.out.println("10th inheritance");
}


protected void test11() {
	System.out.println(" 11th other package inritance");
}
protected static void test12() {
	System.out.println(" 12th other package inritance");
}




public static void main(String[] args) {
	Parentclass obj = new Parentclass();
	System.out.println(obj.a); // calling  non static variable from this class
	System.out.println(f);// calling   static variable from this class
	obj.test1();           // calling  non static method from this class
	Parentclass.test6();  // calling  non static method from this class
}





















}
