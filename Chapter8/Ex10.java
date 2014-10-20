package polymorphism;
/**
 * An extensible program for polymorphism
 * Chapter 8 in Thinking in Java
 * Practice 10
 */
class Triangle extends Shapes{	
	@Override public String line(){
		return "Trianle using Bold";
	}
}
class Shapes {
	// the first method calls the second method
	public void draw()
	{
		Prt.prt("Shapes with line " + line());
	}
	public String line(){
		return "Bold";
	}
}
public class Ex10{
	// the derived methods, draw() and line() are belongs to the derived class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes x = new Triangle();
		x.draw();
	}
}
