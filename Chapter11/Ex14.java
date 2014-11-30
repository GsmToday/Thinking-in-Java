/**
 * Inner class
 * Chapter 10 in Thinking in Java
 * Practice 14
 * inner classes have transparent access to their outer class
 * objects, even private fields and methods.
 */
package holding;
import java.util.*;
public class Ex14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList();
		//ListIterator<Integer> it = list.listIterator(); 
		for(int i = 1;i<=10;i++){
			ListIterator<Integer> it = list.listIterator(i/2); 
			it.add(i);
		}
		System.out.println(list);
	}
}
