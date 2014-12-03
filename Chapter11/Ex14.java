/**
 * holding object
 * Chapter 11 in Thinking in Java
 * Practice 14
 */
package holding;
import java.util.*;
public class Ex14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList();
		//ListIterator<Integer> it = list.listIterator(); 
		for(int i = 0;i<10;i++){
			System.out.println(""+i/2);
			ListIterator<Integer> it = list.listIterator(i/2); 
			it.add(i);
		}
		System.out.println(list);
	}
}
