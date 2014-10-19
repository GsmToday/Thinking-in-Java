/**
 * Composition with public class member
 * For code reuse
 * Chapter 7 in Thinking in Java
 * Practice 18
 */
package reusing;

import java.util.Random;

// ����һ������static final���final����࣬˵�����߼������ 
// ���У�final��ֵ����Ϊstatic �� ��static�����𣬴�����ֻ��������ʱ�ڱ���ʼ���Ż����֡�
// 		 ��Ϊ�������Ա���ʱ��ֵһ��ͬ��.
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
