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
// 在JVM生成Derive 对象之前，先分配存储空间。
// 分配存储空间之后，i赋值是默认值0
// 所以Base 调用print时候，跳到子类的print，然后输出Derived 0
// 在Base 构造函数之后，再Derived 构造函数。