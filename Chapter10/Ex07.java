/**
 * Inner class
 * Chapter 10 in Thinking in Java
 * Practice 07/8
 * inner classes have transparent access to their outer class
 * objects, even private fields and methods.
 */
package Innerclass;

public class Ex07 {
	private int i ;
	private void method1(){
		System.out.println("Outer class method");
	}

	class Inner{
		private int j = 120;;
		void method2(int changed){
			i = changed;
			method1();
		}
	}
	public void inner(){
		Inner in =  new Inner();
		in.j = 47;//外部类可以用内部类private域
		in.method2(12);
		System.out.println("i = "+ i);
	}
	public static void main(String[] args) {
		Ex07 e = new Ex07();
		e.inner();
	}

}
