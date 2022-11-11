package Basic;

public class Instance {
	int a = 40;
	String s = "velocity";
	static int i =10; // static ra direct class saha relation thaye so yaku main method re call karibaku padeni , au sabu ku main menthod re call karibaku pade
	public static void main(String[]args)
	{
		Instance a1 = new Instance(); // rule to crate or  object in main method i.e classname reference = new classname();
                System.out.println (a1.a);
                System.out.println (a1.s);
           System.out.println(i);  // static member can be directly called & run  inside the class  no need object creation
           System.out.println( a1.i); // can do like this also
	}
}
