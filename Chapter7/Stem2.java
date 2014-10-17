/**
 * Inheritance for code reuse
 * Chapter 7 in Thinking in Java
 * Practice 10 Constructors for Inheritance with params;
 * @author GSM
 */
package reusing;


class Root{
	Component1 member1 = new Component1();
	Component2 member2 = new Component2();
	Component3 member3 = new Component3();
	Root(int i){
		Prt.prt("Root()"+i);
		member1.show();
		member2.show();
		member3.show();
	}
}
public class Stem2 extends Root{
	Stem2(int i){
		super(i);
		Prt.prt("Stem()"+ i);
	}

	public static void main(String[] args) {
		Stem2 s = new Stem2(100);
	}
}
