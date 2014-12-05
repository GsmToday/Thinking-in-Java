//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package holding;
import polymorphism.*;
import polymorphism.Prt;
import java.util.*;

class Triangle extends Shape{	
	public String line(){
		return "Trianle using Bold";
	}
}
class Circle extends Shape{}
class Square extends Shape{}
class Shape {
	// the first method calls the second method
	public void draw()
	{
		Prt.prt("Shapes with line " + line());
	}
	public String line(){
		return "Bold";
	}
	public String toString(){
		return "shape";
	}
}
	
public class RandomShapeGenerator implements Iterable<Shape>{
	private int shapetogenerate;
	RandomShapeGenerator(int number){
		this.shapetogenerate = number;
	}
	
	public Iterator<Shape> iterator(){
		return new Iterator<Shape>()
		{
			private int index = 0;
			public boolean hasNext(){
				return index < shapetogenerate;
			}
			public Shape next(){
				index = index+1;
				return new Shape();
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
		
	}
	/*
  private Random rand = new Random(47);
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
  */
  public static void main(String[] args) {
	  for(Shape s: new RandomShapeGenerator(5)){
		  System.out.println(s);
	  }
  }
} ///:~
