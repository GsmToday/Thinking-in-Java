package reusing;
/**
 * Composition with public class member
 * For code reuse
 * Chapter 7 in Thinking in Java
 * Practice 14
 */
class Engine{
	public void start(){}
	public void rev(){}
	public void stop(){}
	public void service(){}
}

class Wheel{
	public void inflate(int psi){}
}

class Window{
	public void rollup(){}
	public void rolldown(){}
}

class Door{
	/* notify this
	 * generally, the class member is private
	 * however, to decrease the difficult when reusing
	 * class member can be public which is a special instance
	 */
	//private Window window = new Window(); 
	public Window window = new Window();
	public void open(){}
	public void close(){}
}

public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door
		left = new Door(),
		right = new Door();
	public Car(){
		for (int i = 0;i<4;i++)
		{
			wheel[i] = new Wheel();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.left.window.rollup();
		
		//use engine
		car.engine.service();
		
		car.wheel[0].inflate(72);
	}

}
