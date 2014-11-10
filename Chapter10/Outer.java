/**
 * For 内部类链接到外部类
 * Chapter 10 in Thinking in Java
 * Practice 01/03
 */
package Innerclass;

public class Outer {
	private String s;
	Outer(String s){
		this.s = s;
	}
	
	class Inner{
		//显示外部类private s域
		public String toString(){
			return s;
		}
		Inner(String s){
			System.out.println(s);
		}
	}
	
	public Inner method(String s){
		return new Inner(s);
	}
	
	public static void main(String[] args) {
		Outer o = new Outer("outer");
		Outer.Inner i = o.method("inner class");
		System.out.println(i.toString());
	}
}
