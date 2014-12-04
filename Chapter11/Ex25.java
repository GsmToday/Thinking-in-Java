package holding;
import java.util.*;
public class Ex25 {
	public static void main(String[] args) {
		//key: 单词 
		//value: 单词被发现的位置的Arraylist
		Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		List<String> words = new ArrayList(new TextFile("UniqueWords.java","\\W+"));//read file
		Iterator<String> it = words.iterator();
		Integer index = 0;
		while(it.hasNext())
		{
			index = index + 1;
			String word = it.next();
			//System.out.println(word);
			System.out.println(map.get(word));
			if(map.get(word) == null)
			{
				ArrayList<Integer> indexword = new ArrayList<Integer>();
				indexword.add(index);
				map.put(word,  indexword);
			}
			else{
				map.get(word).add(index);
			}
		}
		System.out.println(map);	
	}
}
