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
	//方法的作用域类创建一个内部类
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
		//返回对此接口的引用
		return new PBook(s);
		*/
	}
	
	public static void main(String[] args) {
		Ex13 e = new Ex13();
		e.book("Before midnight");
	}

}
