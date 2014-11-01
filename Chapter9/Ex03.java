/**
 * For interface,
 * Chapter 9 in Thinking in Java
 * Practice 3
 */
package interface9;

abstract class Base{
	Base(){
		print();
	}
	abstract void print();
	
}

class Derived extends Base{
	private double i = 11.1;
	
	public void print(){
		Prt.prt("Derived + "+ i);
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Derived e = new Derived();
		e.print();
	}
}
// output:
// Derived + 0.0
// Derived + 11.1
// ��JVM����Derive ����֮ǰ���ȷ���洢�ռ䡣
// ����洢�ռ�֮��i��ֵ��Ĭ��ֵ0
// ����Base ����printʱ�����������print��Ȼ�����Derived 0
// ��Base ���캯��֮����Derived ���캯����