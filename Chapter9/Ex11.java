//适配器模式练习
/**
 * For interface,
 * Chapter 9 in Thinking in Java
 * Practice 11
 */
package interface9;
// 每一对字符进行互换 abcd - badc
class SwapString {
	static String swap(String s) {
			StringBuilder sb = new StringBuilder(s);
			for(int i = 0; i < sb.length() - 1; i += 2) {
			char c1 = sb.charAt(i);
			char c2 = sb.charAt(i + 1);
			sb.setCharAt(i, c2);
			sb.setCharAt(i + 1, c1);
			}
			return sb.toString();
		}
}
//适配器
class Adapter implements Processor{
	SwapString s;
	Adapter(SwapString s){
		this.s = s;
	}
	public String name(){
		return s.getClass().getSimpleName();
	}
	public String process(Object input){
		return s.swap((String)input);
	}
}

public class Ex11 {
	public static void main(String[] args) {
		String s = "1234";
		Apply.Applyprocess(new Adapter(new SwapString()),s);
	}
}
