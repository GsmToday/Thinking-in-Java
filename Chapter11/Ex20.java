/**
 * holding object
 * Chapter 11 in Thinking in Java
 * �ж�һ���ļ�ÿ�����ʣ�Ԫ����ĸ���ָ���
 * Practice 20
 */
package holding;
import java.util.*;

public class Ex20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>(new TextFile("UniqueWords.java","\\W+"));
		Set<Character> vowel = new HashSet<Character>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
		Iterator<String> it = set.iterator();
		//ͳ����ƪ����
		Map<Character, Integer> filemap = new HashMap<Character, Integer>();		
		while(it.hasNext()){
			//ͳ��ÿ������
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			String wordtoprocess = it.next();
			char word[] = wordtoprocess.toCharArray();
			System.out.println("word: "+wordtoprocess);
			for(char s: word){
				Integer freq;//ͳ��ÿ������
				Integer freq2;//ͳ����ƪ����
				if(vowel.contains(s))
				{
					freq = map.get(s);
					freq2 = filemap.get(s);
					map.put(s,freq == null ?1 :freq+1);
					filemap.put(s,freq2 == null ?1 :freq2+1);
				}
			}
			System.out.println(map);			
		}
		System.out.println(filemap);	
	}

}
