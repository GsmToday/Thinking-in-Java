/**
 * 创建内部类对象
 * Chapter 10 in Thinking in Java
 * Practice 05
 */
package Innerclass;

 class Outer2 {
	class Inner{
		Inner(){
			System.out.println("Inner created");
		}
	}
 }
 public class Outer3{
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		Outer2.Inner i = outer.new Inner();

	}

}
