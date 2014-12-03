/**
 * holding object
 * Chapter 11 in Thinking in Java
 * For Map
 * Practice 17
 */
package holding;
import java.util.*;
public class Ex17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Gerbil> gerbilMap = new HashMap<String, Gerbil>();
		gerbilMap.put("Fuzzy", new Gerbil(1));
		gerbilMap.put("Spot", new Gerbil(2));
		gerbilMap.put("Tom", new Gerbil(3));
		Iterator<String> it = gerbilMap.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("key: "+key );
			gerbilMap.get(key).hop();
		}
	}

}
