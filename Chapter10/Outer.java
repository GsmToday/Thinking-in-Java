package Innerclass;

public class Outer {
	class Inner{
		Inner(String s){
			System.out.println(s);
		}
	}
	
	public Inner method(String s){
		return new Inner(s);
	}
	
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.method("inner class");
	}
}
