package Basic;

import java.util.ArrayList;
import java.util.Vector;

public class collection {
public static void main(String[] args) {
	ArrayList<String> l = new ArrayList<String>();// Homogenious
	l.add("Velocity");
	l.add("Katraj");
	l.add("velocity");
	l.add("Hello");
	l.add(null);
	l.add(null);
	
	System.out.println(l.get(0));
	System.out.println(l.get(2));
	System.out.println(l.get(4));
	System.out.println(l.get(5));
	
	
	Vector v = new Vector();// Heterogenious
	v.add("Velocity");
	v.add(2022);
	v.add(200.20);
	v.add('z');
	
	System.out.println(v.get(2));// index value
	System.out.println(v.get(1));

}
}



//Arraylist is implimementation class which impliment List Interface