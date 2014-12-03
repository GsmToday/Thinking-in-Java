/**
 * holding object
 * Chapter 11 in Thinking in Java
 * 判断一个文件每个单词，元音字母出现个数
 * Practice 21
 */
package holding;
import java.util.*;

public class Ex21 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(new TextFile("UniqueWords.java","\\W+"));
		System.out.println(words);	
		Map<String,Integer> map = new HashMap();
		Iterator<String> it = words.iterator();
		while(it.hasNext())
		{	
			String wordtoprocess = it.next();
			Integer freq = map.get(wordtoprocess);
			map.put(wordtoprocess, freq == null?1:freq+1);
		}
		//System.out.println(map);	
		//把keys按照字母序排序
		List<String>keys = new ArrayList<String>(map.keySet());	
		Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);
		for(String key:keys){
			System.out.println("key ="+key +" " +map.get(key));
		}
	}
}
