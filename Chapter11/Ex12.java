/**
 * holding object
 * Chapter 11 in Thinking in Java
 * Practice 12
 */
package holding;
import java.util.*;
public class Ex12{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(Arrays.asList(1,2,3,4));
		List<Integer> list2= new ArrayList(4);
		ListIterator<Integer> it = list.listIterator(4);
		while(it.hasPrevious()){
			list2.add( it.previous());
		}
		System.out.println(list);
		System.out.println(list2);
	}
}
