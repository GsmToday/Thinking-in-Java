package String;
//String�����򹤾� matches, split, replaceAll
import java.util.Arrays;

public class Ex {

	public static void main(String[] args) {
		String knight = "bad theha sentence you 1.";		
		//Ex07 ����д��ͷand��Ž�β
		System.out.println(knight.matches("^[A-Z]\\w.*\\.$"));
		//Ex08������the ��you��split
		System.out.print(Arrays.toString(knight.split("the|you")));
		//Ex09 ���»����滻����Ԫ����ĸ
		System.out.print(knight.replaceAll("a|e|i|o|u", "_"));
		
	}
}
