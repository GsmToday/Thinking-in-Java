/**
 * holding object
 * Chapter 11 in Thinking in Java
 * 根据map的key排序
 * Practice 24
 */
package holding;
import java.util.*;
public class Ex24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String, Integer>();
		Map<String,Integer> tempmap = new LinkedHashMap<String, Integer>();
		map.put("zoo", 9);
		map.put("tiger", 5);
		map.put("apple", 7);
		map.put("bear", 3);
		map.put("cat", 1);
		System.out.println(map);
		//Set<Map.Entry<String, Integer>> mset = new LinkedHashSet<Map.Entry<String, Integer>>(map.entrySet());
		//Iterator<Map.Entry<String, Integer>> it = mset.iterator();
		//keySet存在TreeSet里，进行排序
		SortedSet<String> keyset = new TreeSet<String>(map.keySet());
		Iterator<String> it = keyset.iterator();
		while(it.hasNext()){
			String key = it.next();
			tempmap.put(key,map.get(key));
		}
		map.clear();
		map = tempmap;
		//tempmap.clear();
		System.out.println(map);
		
	}

}
