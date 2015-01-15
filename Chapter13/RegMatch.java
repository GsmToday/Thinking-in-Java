//从这句话中找到所有开头为a的单词。

package String;

import java.util.regex.*;

public class RegMatch {
	public static void main(String[] args) {
		String s = "Java now has regular expressions";
		String[] regEx = {
				"\\w*s{1,3}",
				};
		for(String pattern: regEx){
			System.out.println("Regular expression:\"" + pattern + "\"");
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(s);
			while(m.find()){
				System.out.println("Match "  +m.group() + " at position"  + m.start()+(m.end()-1));
				
			}
		}
		

	}
}
