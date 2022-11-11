package Basicpractice;

public class Stringop {
public static void main(String[] args) {
	String s = "Heena";
	
	int len = s.length();
	
	for (int i = len-1; i>=0;i--) {
		System.out.print(s.charAt(i));
	}
}
}
