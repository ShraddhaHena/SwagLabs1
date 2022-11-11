package Basic;

public class SBSB {
public static void main(String[] args) {
	String s = new String("Velocity");
	String sn = s.toUpperCase();
	System.out.println(s);
	System.out.println(sn);
	
	StringBuilder sb = new StringBuilder(s);
	sb.reverse();
	System.out.println(sb);
	
	StringBuffer SB = new StringBuffer(s);
	SB.append("Pune");
	System.out.println(SB);
}
}
// String Buffer & Builder are mutable while String is immutable
//Here s is a string value so it is immutable we cant change its value but using String Buffer And BUilder its possible to change its value.

//Whats difference between String BUffer & String BUilder ??

//mutliple Execution from one method is multi threading.
//(String builder) -- so it is not Syncronised(Not have capacity to decide).,, not tread safe ,fast
//String Buffer - slow, tread safe, syncronised ( having capacity to take decisions).. only Who comes first can take the data,,once first finish his work then the next can take the data