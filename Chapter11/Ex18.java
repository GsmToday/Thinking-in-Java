/**
 * holding object
 * Chapter 11 in Thinking in Java
 * For Map sort
 * Practice 18
 */
package holding;
import java.util.*;
public class Ex18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("bag", 200);
		map.put("apple", 100);
		map.put("zoo", 300);
		map.put("cat", 50);
		map.put("tiger", 400);
		System.out.println("sort by hash code"+ map);
		String[] keys = map.keySet().toArray(new String[0]);
		Arrays.sort(keys);
		Map<String,Integer> map2 = new LinkedHashMap<String,Integer>();
		for(String key: keys){
			map2.put(key, map.get(key));
		}
		System.out.println("sort by key"+ map2);		
	}
}
