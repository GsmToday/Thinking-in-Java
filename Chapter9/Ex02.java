/**
 * For interface,
 * demonstrate we cannot create an object from abstract class
 * Chapter 9 in Thinking in Java
 * Practice 1
 */
package interface9;

abstract class Rodent{
	public void show(){
		Prt.prt("a");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent e = new Rodent();
	}

}
