/**
 * holding object
 * Chapter 11 in Thinking in Java
 * For Map sort
 * Practice 19
 */
package holding;
import java.util.*;
public class Ex19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("bag");
		set.add("apple");
		set.add("zoo");
		set.add("cat");
		set.add("tiger");
		System.out.println("sort by hash code"+ set);
		HashSet<String> set2 = new LinkedHashSet<String>();
		String[] keys = set.toArray(new String[0]);
		Arrays.sort(keys);
		for(String key: keys){
			set2.add(key);
		}
		System.out.println("sort by key"+ set2);
	}

}
