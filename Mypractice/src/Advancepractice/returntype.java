package Advancepractice;

public class returntype {

	String s = "velocity";
	public void test() {
		int a= 10+40;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
       returntype obj = new returntype();
        obj.test();
        
       char c = obj.s.charAt(5);
        System.out.println(c);
 }
	
	
	
	
	
	
	
}
