/**
 * holding object
 * Chapter 11 in Thinking in Java
 * Practice 10
 */
package holding;
import java.util.*;
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

class Gerbil2 extends Rodent{
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
class Rodent {
	private String name = "Rodent";
	// reference counting
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;;
	
	
	public void eat() {
		Prt.prt("Rodent.eat()"); 
		}
	public void run() { 
		Prt.prt("Rodent.run()");
		}
	public void sleep() { 
		Prt.prt("Rodent.sleep()");
		}
	public String toString() {
		return name;
		}
	public static void display(Iterator<Rodent> it){
		while(it.hasNext()){
			Rodent r = it.next();
			System.out.println(r);
		}
	}
	public static void main(String[] args) {	
		//ArrayList<Rodent> r = new ArrayList<Rodent>();
		//r.add(new Mouse());
		//r.add(new Gerbil2());
		//r.add(new Hambster());
		//or
		ArrayList<Rodent> r = new ArrayList<Rodent>(Arrays.asList(new Mouse(),new Gerbil2(),new Hambster()));
		display(r.iterator());			
	}
}
