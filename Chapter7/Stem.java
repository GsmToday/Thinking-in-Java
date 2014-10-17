/**
 * Inheritance for code reuse
 * Chapter 7 in Thinking in Java
 * Practice 9
 * @author GSM
 */
package reusing;


class Root{
	Component1 member1 = new Component1();
	Component2 member2 = new Component2();
	Component3 member3 = new Component3();
	Root(){
		Prt.prt("Root()");
		member1.show();
		member2.show();
		member3.show();
	}
}
public class Stem extends Root{
	Stem(){
		Prt.prt("Stem()");
	}

	public static void main(String[] args) {
		Stem s = new Stem();
	}
}
