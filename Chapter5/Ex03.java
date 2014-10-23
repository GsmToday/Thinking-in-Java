/**
 * For initialization
 * Chapter 5 in Thinking in Java
 * Practice 3/4
 */

package initializationandcleanup;

public class Ex03 {
	Ex03(){
		Prt.prt("Default Constructor");
	}
	Ex03(String s){
		Prt.prt("Parameter Constructor" + s);
	}
	public static void main(String[] args) {
		new Ex03(" input string");		
	}
}
