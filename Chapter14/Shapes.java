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
	public String toString(){
		return "Circle";
	}
	void rotate() {
		throw new UnsupportedOperationException();
		}
}
class Square extends Shape{
	public String toString(){
		return "Square";
	}
}
class Rhomboid extends Shape{
	public String toString(){
		return "Rhomboid";
	}
}

class Triangle extends Shape{
	public String toString(){
		return "triangle";
	}
}
public class Shapes {	
	static void printInfo(Class cc){
		//返回Class对象引用，以及判断是不是interface
		System.out.println(" Class name: " + cc.getName() + " is interface?[ " + cc.isInterface()+" ] " );
		//返回类名
		System.out.println(" Simple name "+cc.getSimpleName());
		System.out.println(" Canonical name "+cc.getCanonicalName());
	}
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for(Shape shape:shapeList){
			if(!(shape instanceof Circle))
			shape.draw();
		}
		Shape newShape = new Rhomboid();
		Rhomboid r = (Rhomboid)newShape;
	
		//printInfo(c1);
		Circle c = null;
		/*
		if(newShape instanceof Circle){
		c = (Circle)newShape;
		}
		else
			System.out.println("shape not a Circle");
	}*/

		}

}
