/**
 * holding object
 * Chapter 11 in Thinking in Java
 * 判断每个文件中的单词中，元音字母个数
 * Practice 16
 */
package holding;
import java.util.*;
public class Ex16 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>(new TextFile("UniqueWords.java","\\W+"));
		System.out.println(set1);
		Iterator<String> list = set1.iterator();
		String word;
		String expr = "A E I O U a e i o u";
	//	char data[] = expr.toCharArray();
		String data[] = expr.split(" ");
		
		
		while(list.hasNext()){
			int vowel=0;
			word = list.next();
			System.out.println(word);
			for(int i = 0;i<data.length;i++){
				if(word.contains(data[i]))
					vowel++;
			}
			System.out.println(word +" has vowel "+ vowel);
		}
	   
	}
}
