/**
 * For initialization
 * Chapter 5 in Thinking in Java
 * Practice 2
 */
package initializationandcleanup;

public class Ex02 {
	String s = "A";
	String s2;
	Ex02 (){
		s2 = "B";
	}
	public static void main(String[] args) {
		Ex02 e = new Ex02();
		System.out.println(e.s);
		System.out.println(e.s2);
	}
}
