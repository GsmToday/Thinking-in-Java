/**
 * Inner class
 * Chapter 10 in Thinking in Java
 * Practice 09/13
 * Anonymous inner class
 */
package Innerclass;

interface Book{
	public void value();
}
public class Ex13 {
	//�������������ഴ��һ���ڲ���
	public Book book(final String s){
		return new Book()
		{
			private String name;
			{
				this.name = s;
			}
			public void value(){
				System.out.println(name);
			}
		};
		/*
		class PBook implements Book{
			private String name;
			private PBook(String name){
				this.name = name;
			}
			public void value(){
				System.out.println(name);
			}
		}
		//���ضԴ˽ӿڵ�����
		return new PBook(s);
		*/
	}
	
	public static void main(String[] args) {
		Ex13 e = new Ex13();
		e.book("Before midnight");
	}

}
