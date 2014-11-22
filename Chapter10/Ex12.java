/**
 * Inner class
 * Chapter 10 in Thinking in Java
 * Practice 12
 * inner classes have transparent access to their outer class
 * objects, even private fields and methods.
 */
package Innerclass;
interface Inner{}

public class Ex12 {
	private int i;
	private void method1(){
		System.out.println("Outer class method");
	}
	public void inner(){
		System.out.println("i = "+ i);
		//Note this
		 new Inner(){
			//�ڲ����޸��ⲿ�����
			private int j = 47;
			//�����ⲿ��ķ���
			public void method2(){
				i = j;
				method1();
			}
		}.method2();
		System.out.println("i = "+ i);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ex12 e = new Ex12();
		e.inner();
	}

}
