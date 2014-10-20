/**
 * An extensible program for polymorphism
 * Chapter 8 in Thinking in Java
 * Practice 9
 */
package polymorphism;

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
class Rodent {
	private String name = "Rodent";
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
