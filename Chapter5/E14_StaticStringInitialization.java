/**
 * For initialization,
 * demonstrates that they are both initialized before they are used
 * Chapter 5 in Thinking in Java
 * Practice 14
 */
package initializationandcleanup;

public class E14_StaticStringInitialization {
	static String s1 = "Initialized at definition";
	static String s2 ;
	static {
		s2 = "Initialized at static block";
	}
	static void print(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prt.prt(s1);
		Prt.prt(s2);
	}

}
