package typeinfo;
import java.util.*;

abstract class Shape{
	void draw(){
		Prt.prt(this+".draw()");
	}
	abstract public String toString();
	void rotate(){
		Prt.prt("rotating");
	}
}

class Circle extends Shape{
	boolean flag = false;
	public String toString(){
		return (flag? "H" : "Unh"+"ighlighted + Circle");
	}
	void rotate() {
		throw new UnsupportedOperationException();
		}
}
class Square extends Shape{
	boolean flag = false;
	public String toString(){
		return (flag? "H" : "Unh"+"ighlighted + Square");
	}
}
class Rhomboid extends Shape{
	boolean flag = false;
	public String toString(){
		return (flag? "H" : "Unh"+"ighlighted + Rhomboid");
	}
}

class Triangle extends Shape{
	boolean flag = false;
	public String toString(){
		return (flag? "H" : "Unh"+"ighlighted + Triangle");
	}
}
public class Shapes06 {	
	public static void setFlag(Shape s){
		if(s instanceof Triangle)
		{	
			((Triangle)s).flag = true; 
		}
	}
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for(Shape shape:shapeList){
			setFlag(shape);
			shape.draw();
		}	
	}
}
