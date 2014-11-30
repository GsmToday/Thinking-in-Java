package holding;
import java.util.*;
/**
 * holding object
 * Chapter 11 in Thinking in Java
 * Practice 11
 */
public class Ex11 {
	public static void display(Iterator<String> it){
		 while(it.hasNext()){
			 String c = it.next();
			 System.out.println(c.toString());
			 }			
	}
	public static void main(String[] args) {
		ArrayList<String> t1 = new ArrayList<String>(Arrays.asList("cat","dog","sheep"));
		LinkedList<String> t2 = new LinkedList<String>(Arrays.asList("cat","dog","sheep"));
		HashSet<String> t3 = new HashSet<String>(Arrays.asList("cat","dog","sheep"));
		TreeSet<String> t4 = new TreeSet<String>(Arrays.asList("cat","dog","sheep"));

		display(t1.iterator());
		display(t2.iterator());
		display(t3.iterator());
		display(t4.iterator());
	}

}
