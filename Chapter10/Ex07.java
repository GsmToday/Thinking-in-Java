/**
 * Inner class
 * Chapter 10 in Thinking in Java
 * Practice 07
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
		void method2(int changed){
			i = changed;
			method1();
		}
	}
	public void inner(){
		Inner in =  new Inner();
		in.method2(12);
		System.out.println("i = "+ i);
	}
	public static void main(String[] args) {
		Ex07 e = new Ex07();
		e.inner();
	}

}
