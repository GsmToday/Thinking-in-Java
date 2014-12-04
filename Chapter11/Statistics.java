/**
 * holding object
 * Chapter 11 in Thinking in Java
 * Map.Entry遍历哈希map 
 * Practice 23
 */
package holding;
import java.util.*;
public class Statistics {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		//存储随机数and出现频次
		Map<Integer, Integer> m = new HashMap<Integer,Integer>();		
		for(int i=0;i<10000;i++){
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null?1:freq+1);
		}
		
		//存储map m的key-value pair
		Set<Map.Entry<Integer, Integer>> mset = new LinkedHashSet<Map.Entry<Integer, Integer>>(m.entrySet());
		Iterator<Map.Entry<Integer, Integer>> it = mset.iterator();		
		Map.Entry<Integer, Integer> entry =  it.next();
		Integer max= entry.getValue();
		Integer key= entry.getKey();

		System.out.println(mset);
		while(it.hasNext()){
			entry =  it.next();
			//System.out.println("tt"+entry);
			if(entry.getValue() > max)
			{
				max = entry.getValue();
				key = entry.getKey();
			}
		}
		System.out.println(""+max);
		System.out.println(""+key);
	}	
	
}	