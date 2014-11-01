/**
 * For interface,
 * demonstrate the abstract class
 * Chapter 9 in Thinking in Java
 * Practice 1
 */
package interface9;

abstract class Rodent {
	private String name = "Rodent";
	// reference counting
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;;
	
	public abstract void eat();
	
	public abstract void run();
	
	public abstract void sleep();
	
	public String toString() {
		return name;
		}
}

class Mouse extends Rodent{
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

class Gerbil extends Rodent{
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
class Hambster extends Rodent{
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
// To describe a class
class Description{
	String s; 
	// reference counting
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;;
	
	Description()
	{
		this.s = s;
		Prt.prt("Creating " + this);
	}
	void dispose(){
		Prt.prt("disposing" + this);
	}
	
	public String toString(){
		return "Description " + id;
	}

}
public class Ex01{
	public static void main(String[] args) {	
		Rodent[] animal = {
				new Mouse(),
				new Gerbil(),
				new Hambster()
		};
		for(Rodent i: animal){
			i.eat();
		}		
	}
}

