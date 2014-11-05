// Simple factory pattern 简单工厂模式
/**
 * For interface,
 * interface can inherit interfaces
 * Chapter 9 in Thinking in Java
 * Practice 14/15
 */
package interface9;

interface Cycle{
	void ride();
}

interface CycleFactory{
	Cycle createCycle();
}

class Unicycle implements Cycle{
	public void ride(){
		Prt.prt("Ride Unicycle");
	}
}

class Bicycle implements Cycle{
	public void ride(){
		Prt.prt("Ride Bicycle");
	}
}

class Tricycle implements Cycle{
	public void ride(){
		Prt.prt("Ride Tricycle");
	}
}
//一个统一的工厂类，负责创建product对象
class Factory implements CycleFactory{
	private Cycle i ;
	Factory(Cycle i){
		this.i = i;
	}
	public Cycle createCycle(){
		return  i;
	}
}

public class Ex18 {
	public static void createCycle(CycleFactory cf){
		Cycle c = cf.createCycle();
		c.ride();
		
	}
	public static void main(String[] args) {
		createCycle(new Factory(new Bicycle()));
		createCycle(new Factory(new Unicycle()));
		createCycle(new Factory(new Tricycle()));
		
	}
}
