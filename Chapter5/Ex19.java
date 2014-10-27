/**
 * For array initialization 可变参数列表
 * Chapter 5 in Thinking in Java
 * Practice 19
 */
package initializationandcleanup;

public class Ex19 {
	static void f(String ... args){
		for(String s : args)
		{
			System.out.println(""+s);
		}
		
	}
	public static void main(String[] args) {
		//指定元素列表后，编译器会自动填充为数组
		f("I","am", "GSM");
		// 直接传递数组
		f(new String[] {"am", "GSM"});
	}

}
