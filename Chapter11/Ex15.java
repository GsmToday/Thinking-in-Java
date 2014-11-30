/**
 * holding object
 * Chapter 11 in Thinking in Java
 * Practice 15
 */
package holding;
import java.util.*;
public class Ex15 {
	private final static Stack<Character> stack = new Stack<Character>();
	private static void evaluate(String expr){
		char data[] = expr.toCharArray();
		for(int i =0;i<data.length;){
			switch(data[i++]){
			case '+': stack.push(data[i++]);
			break;
			case '-': System.out.println(stack.pop());	
			break;
			}
		}
	}
	public static void main(String[] args) {			
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		evaluate(s);
	}

}
