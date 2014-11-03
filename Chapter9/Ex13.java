/**
 * For interface,
 * demonstrate the Java avoids the "diamond problem" produced by multiple inheritance.
 * Chapter 9 in Thinking in Java
 * Practice 1
 */
package interface9;

interface interface01{
	void f();
}

interface interface02 extends interface01{
	void f();
}

interface interface03 extends interface01{
	void f();
}

interface interface04 extends interface01, interface02{
	void f();
}
class CombinedInterface implements interface04{
	public void f() {
			System.out.println("CombinedImpl.f()");
		}
}
public class Ex13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinedInterface e = new CombinedInterface();
		e.f();
	}

}
