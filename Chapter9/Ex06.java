/**
 * For interface,
 * to make Rodent as an interface
 * Chapter 9 in Thinking in Java
 * Practice 7
 */
package interface9;
interface Rodent3{
	String name = "Rodent";
	
	public void eat();
	
	public void run();
	
	public void sleep();
}

class Mouse3 implements Rodent3{
	private String name = "Mouse";
	public void eat() {
		Prt.prt("Mouse.eat()"); 
		}
	public void run() { 
		Prt.prt("Mouse.run()");
		}
	public void sleep() { 
		Prt.prt("Mouse.sleep()");
		}
	public String toString() {
		return name;
		}
}

class Gerbil3 implements Rodent3{
	private String name = "Gerbil";
	public void eat() {
		Prt.prt("Gerbil.eat()"); 
		}
	public void run() { 
		Prt.prt("Gerbil.run()");
		}
	public void sleep() { 
		Prt.prt("Gerbil.sleep()");
		}
	public String toString() {
		return name;
		}
}
class Hambster3 implements Rodent3{
	private String name = "Hambster";
	public void eat() {
		Prt.prt("Hambster.eat()"); 
		}
	public void run() { 
		Prt.prt("Hambster.run()");
		}
	public void sleep() { 
		Prt.prt("Hambster.sleep()");
		}
	public String toString() {
		return name;
		}
}
public class Ex06{
	public static void main(String[] args) {	
		Rodent3[] animal = {
				new Mouse3(),
				new Gerbil3(),
				new Hambster3()
		};
		for(Rodent3 i: animal){
			i.eat();
		}		
	}
}
