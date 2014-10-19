/**
 * Composition with public class member
 * For code reuse
 * Chapter 7 in Thinking in Java
 * Practice 18
 */
package reusing;

import java.util.Random;

// 创建一个含有static final域和final域的类，说明二者间的区别。 
// 书中：final数值定义为static 和 非static的区别，此区别只有在运行时内被初始化才会显现。
// 		 因为编译器对编译时数值一视同仁.
public class FinalData2 {
	private static Random rand = new Random();
	private final int valueOne = rand.nextInt(20);
	private static final int VALUE_TWO = rand.nextInt(20);
	
	public static void main(String[] args) {
		FinalData2 data1 = new FinalData2();
		Prt.prt(""+data1.valueOne);
		Prt.prt(""+data1.VALUE_TWO);
		FinalData2 data2 = new FinalData2();
		Prt.prt(""+data2.valueOne);
		Prt.prt(""+data2.VALUE_TWO);
	}
}
// output
//16
//18
//14
//17
