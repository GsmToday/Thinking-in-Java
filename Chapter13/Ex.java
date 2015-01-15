package String;
//String的正则工具 matches, split, replaceAll
import java.util.Arrays;

public class Ex {

	public static void main(String[] args) {
		String knight = "bad theha sentence you 1.";		
		//Ex07 检查大写开头and句号结尾
		System.out.println(knight.matches("^[A-Z]\\w.*\\.$"));
		//Ex08句子在the 和you处split
		System.out.print(Arrays.toString(knight.split("the|you")));
		//Ex09 用下划线替换所有元音字母
		System.out.print(knight.replaceAll("a|e|i|o|u", "_"));
		
	}
}
